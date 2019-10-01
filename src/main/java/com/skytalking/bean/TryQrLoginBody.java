package com.skytalking.bean;

public class TryQrLoginBody {

    /**
     * uri : 70003
     * version : 2.4
     * context : WB-5fc2264b8a0b447da63e6b560d059cf3-C890D7801B900001F6CC12A061E0101C-0e74af240a49595ddd019c989d98e11e
     * appId : 5002
     * smid :
     * lcid : 2052
     * byPass : 3
     * sdid : 64510261
     * requestId : 64533822
     * data : {"qrId":"VJdwtsjnkTjlMGGnor","remember":"1","behavior":"%5B%7B%22page.login%22%3A%220.043%22%7D%2C%7B%22button.UDBSdkPage.qrcode%22%3A%2213.25%2C13%2C315%22%7D%5D","page":"https://www.huya.com/663844"}
     */

    public String uri = "7003";
    public String version = "2.4";
    public String context = "";
    public String appId = "5002";
    public String smid = "";
    public String lcid = "2052";
    public String byPass = "3";
    public String sdid = "64510261";
    public String requestId = "";
    public DataBean data = new DataBean();

    public static class DataBean {
        /**
         * qrId : VJdwtsjnkTjlMGGnor
         * remember : 1
         * behavior : %5B%7B%22page.login%22%3A%220.043%22%7D%2C%7B%22button.UDBSdkPage.qrcode%22%3A%2213.25%2C13%2C315%22%7D%5D
         * page : https://www.huya.com/663844
         */

        public String qrId = "";
        public String remember = "1";
        public String behavior = "";
        public String page = "https://www.huya.com";
    }

    public TryQrLoginBody(String context, String requestId, String qrId) {
        this.context = context;
        this.requestId = requestId;
        this.data.qrId = qrId;
    }

    public TryQrLoginBody() {

    }

    @Override
    public String toString() {
        return "TryQrLoginBody{" +
                "uri='" + uri + '\'' +
                ", version='" + version + '\'' +
                ", context='" + context + '\'' +
                ", appId='" + appId + '\'' +
                ", smid='" + smid + '\'' +
                ", lcid='" + lcid + '\'' +
                ", byPass='" + byPass + '\'' +
                ", sdid='" + sdid + '\'' +
                ", requestId='" + requestId + '\'' +
                ", data=" + data +
                '}';
    }
}
