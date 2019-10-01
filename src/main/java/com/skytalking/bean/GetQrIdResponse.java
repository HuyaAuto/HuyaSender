package com.skytalking.bean;

public class GetQrIdResponse {

    /**
     * uri : 70002
     * version : null
     * context : WB-5fc2264b8a0b447da63e6b560d059cf3-C890D7801B900001F6CC12A061E0101C-0e74af240a49595ddd019c989d98e11e
     * requestId : 64523534
     * returnCode : 0
     * message : null
     * description : null
     * data : {"qrId":"VJdwtsjnkTjlMGGnor"}
     */

    public int uri;
    public Object version;
    public String context;
    public int requestId;
    public int returnCode;
    public Object message;
    public Object description;
    public DataBean data;

    public static class DataBean {
        /**
         * qrId : VJdwtsjnkTjlMGGnor
         */

        public String qrId;

        @Override
        public String toString() {
            return "DataBean{" +
                    "qrId='" + qrId + '\'' +
                    '}';
        }
    }

    @Override
    public String toString() {
        return "GetQrIdResponse{" +
                "uri=" + uri +
                ", version=" + version +
                ", context='" + context + '\'' +
                ", requestId=" + requestId +
                ", returnCode=" + returnCode +
                ", message=" + message +
                ", description=" + description +
                ", data=" + data +
                '}';
    }
}
