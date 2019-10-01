package com.skytalking.popup;

import com.google.gson.Gson;
import com.intellij.ide.util.PropertiesComponent;
import com.intellij.openapi.application.ApplicationManager;
import com.intellij.openapi.application.ModalityState;
import com.intellij.openapi.ui.DialogWrapper;
import com.intellij.uiDesigner.core.GridConstraints;
import com.skytalking.bean.GetQrIdResponse;
import com.skytalking.bean.TryQrLoginResponse;
import com.skytalking.huya.CommonLib;
import com.skytalking.huya.OkHttpService;
import com.skytalking.windows.ScanCodeDialog;
import okhttp3.*;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;
import java.awt.*;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URL;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;

public class ScanCodeDialogWrapper extends DialogWrapper {
    private ScanCodeDialog scanCodeDialog;
    private AtomicInteger atomicInteger = new AtomicInteger(0);
    private Gson gson = new Gson();
    private GetQrIdResponse getQrIdResponse;
    private TryQrLoginResponse tryQrLoginResponse;

    public ScanCodeDialogWrapper() {
        super(true);
        init();
        setTitle("扫描二维码登录");

    }

    @Nullable
    @Override
    protected JComponent createCenterPanel() {
        scanCodeDialog = new ScanCodeDialog();
        ApplicationManager.getApplication().executeOnPooledThread(this::doScanLoginAsync);
        return scanCodeDialog.contentPanel;
    }

    public void loadScanCode(String imageUrl) {
        new ImageLoaderWorker(imageUrl, image -> {
            JLabel jLabel = new JLabel(new ImageIcon(image));
            GridConstraints gridConstraints = new GridConstraints();
            gridConstraints.setFill(GridConstraints.FILL_BOTH);
            scanCodeDialog.contentPanel.add(jLabel, gridConstraints);
            scanCodeDialog.contentPanel.revalidate();
            scanCodeDialog.contentPanel.repaint();
        }).execute();
    }

    @NotNull
    @Override
    protected Action[] createActions() {
        return new Action[]{};
    }

    private static class ImageLoaderWorker extends SwingWorker<Image, Image> {
        private String imageUrl;
        private ImageLoaderCallback callback;

        public ImageLoaderWorker(String imageUrl, ImageLoaderCallback callback) {
            this.imageUrl = imageUrl;
            this.callback = callback;
        }

        @Override
        protected Image doInBackground() throws Exception {
            return Toolkit.getDefaultToolkit().getImage(new URL(imageUrl));
        }

        @Override
        protected void done() {
            try {
                callback.onImageLoadFinished(get());
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    private interface ImageLoaderCallback {
        void onImageLoadFinished(Image image);
    }


    private void loopQueryForLogin() {

    }

    private void doScanLoginAsync() {
//        https:
////udblgn.huya.com/qrLgn/getQrId
//        https://udblgn.huya.com/qrLgn/getQrImg?k=VJdwtsjnkTjlMGGnor
//        https:
////udblgn.huya.com/qrLgn/tryQrLogin
//        {
//            "uri":"70003", "version":"2.4", "context":
//            "WB-5fc2264b8a0b447da63e6b560d059cf3-C890D7801B900001F6CC12A061E0101C-0e74af240a49595ddd019c989d98e11e", "appId":
//            "5002", "smid":"", "lcid":"2052", "byPass":"3", "sdid":"64510261", "requestId":"64533822", "data":{
//            "qrId":"VJdwtsjnkTjlMGGnor", "remember":"1", "behavior":
//            "%5B%7B%22page.login%22%3A%220.043%22%7D%2C%7B%22button.UDBSdkPage.qrcode%22%3A%2213.25%2C13%2C315%22%7D%5D", "page":
//            "https://www.huya.com/663844"
//        }
//        }
//        {
//            "uri":"70001", "version":"2.4", "context":
//            "WB-5fc2264b8a0b447da63e6b560d059cf3-C890D7801B900001F6CC12A061E0101C-0e74af240a49595ddd019c989d98e11e", "appId":
//            "5002", "smid":"", "lcid":"2052", "byPass":"3", "sdid":"64510261", "requestId":"64523534", "data":{
//        }
//        }
//        web_qrlogin_confirm_id
        String qrloginId = UUID.randomUUID().toString();
        String wbContext = "HUYA-" + UUID.randomUUID().toString();
//        wbContext = "WB-5fc2264b8a0b447da63e6b560d059cf3-C890D7801B900001F6CC12A061E0101C-0e74af240a49595ddd019c989d98e11e";
        int sdid = atomicInteger.incrementAndGet();
//        sdid = 46270547;
        OkHttpService.getInstance().clearCookie();
        OkHttpService.getInstance().setCookie("udblgn.huya.com", new Cookie.Builder().name("web_qrlogin_confirm_id")
                .domain("udblgn.huya.com").value(qrloginId).build());
        OkHttpClient okHttpClient = CommonLib.okHttp();
        Request request = new Request.Builder().post(RequestBody.create(MediaType.parse("application/json;charset=UTF-8"), "{\"uri\":\"70001\",\"version\":\"2.4\",\"context\":\"" +
                wbContext + "\",\"appId\":\"5002\",\"smid\":\"\",\"lcid\":\"2052\",\"byPass\":\"3\",\"sdid\":\"" +
                sdid + "\",\"requestId\":\""
                + atomicInteger.incrementAndGet() + "\",\"data\":{}}"))
                .url("https://udblgn.huya.com/qrLgn/getQrId").build();
        Call newCall = okHttpClient.newCall(request);
        String bodyString = getBodyString(newCall);
        if (bodyString == null) return;
        getQrIdResponse = gson.fromJson(bodyString, GetQrIdResponse.class);
        System.out.println(bodyString);
        try {
            System.out.println(new String(bodyString.getBytes("UTF-8"), "GBK"));
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        System.out.println(getQrIdResponse);
        loadScanCode(" https://udblgn.huya.com/qrLgn/getQrImg?k=" + getQrIdResponse.data.qrId);
        boolean shouldExit = false;
        while (!shouldExit && !isDisposed()) {
            Request tryLoginRequest = new Request.Builder().url(" https://udblgn.huya.com/qrLgn/tryQrLogin")
                    .post(RequestBody.create(MediaType.parse("application/json;charset=UTF-8"), "{\"uri\":\"70003\",\"version\":\"2.4\",\"context\":\"" + wbContext
                            + "\",\"appId\":\"5002\",\"smid\":\"\",\"lcid\":\"2052\",\"byPass\":\"3\",\"sdid\":\"" + sdid
                            + "\",\"requestId\":\"46284688\",\"data\":{\"qrId\":\"" + getQrIdResponse.data.qrId
                            + "\",\"remember\":\"1\",\"behavior\":\"\",\"page\":\"https://www.huya.com/\"}}"))
                    .build();
            Call newCall1 = okHttpClient.newCall(tryLoginRequest);
            String bodyString1 = getBodyString(newCall1);
            if (bodyString1 != null) {
                System.out.println(bodyString1);
                TryQrLoginResponse tryQrLoginResponse = gson.fromJson(bodyString1, TryQrLoginResponse.class);
                System.out.println(tryQrLoginResponse);
                if (tryQrLoginResponse.data.stage == 2) {
                    //授权成功
                    PropertiesComponent.getInstance().setValue("uid", String.valueOf(tryQrLoginResponse.data.uid));
                    PropertiesComponent.getInstance().setValue("biztoken", tryQrLoginResponse.data.biztoken);
                }
                if (tryQrLoginResponse.data.stage >= 2) {
                    shouldExit = true;
                    ApplicationManager.getApplication().invokeLater(() -> close(OK_EXIT_CODE), ModalityState.any());
                }
            }

            try {
                Thread.sleep(1500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }

    }

    private String getBodyString(Call call) {
        try {
            Response response = call.execute();
            return response.body().string();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
