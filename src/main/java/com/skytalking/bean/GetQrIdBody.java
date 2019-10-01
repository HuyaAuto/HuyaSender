package com.skytalking.bean;

public class GetQrIdBody {

    /**
     * uri : 70001
     * version : 2.4
     * context : WB-5fc2264b8a0b447da63e6b560d059cf3-C890D7801B900001F6CC12A061E0101C-0e74af240a49595ddd019c989d98e11e
     * appId : 5002
     * smid :
     * lcid : 2052
     * byPass : 3
     * sdid : 64510261
     * requestId : 64523534
     * data : {}
     */

    public String uri = "7001";
    public String version = "2.4";
    public String context = "";
    public String appId = "5002";
    public String smid = "";
    public String lcid = "2502";
    public String byPass = "3";
    public String sdid = "64523534";
    public String requestId = "";
    public DataBean data = new DataBean();

    public GetQrIdBody() {
    }

    public GetQrIdBody(String context, String requestId) {
        this.context = context;
        this.requestId = requestId;
    }

    public static class DataBean {
    }

    @Override
    public String toString() {
        return "GetQrIdBody{" +
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
