package com.skytalking.bean;

public class TryQrLoginResponse {

    /**
     * uri : 70004
     * version : null
     * context : HUYA-3fbba15d-e1ef-4e48-8227-f835fba33199
     * requestId : 0
     * returnCode : 0
     * message : null
     * description :
     * data : {"uid":1199517413048,"passport":"","subUid":0,"regOrigin":0,"version":"1.0","biztoken":"AQAgEujli70_r75E6DDZw4ywplT6PVTtFUWIt56vmt9o4Eu7kxx8Yy0qFtyX7SXk5k-yqYeT_vZXZ7uT95cRkin5erweCyp2KQ6_BdyskKylRMnBk7XCbyJVNNaKfB0J-Sjc4ZVc1ENB9fj5nimj80PtA-JQDrAhY7tmNBzTijZTM1-A7rw3SIiHIC_Ay2nJnglfofLAd8sLWTLldxhxkrQ76SAt-aByN9hMQRriwR6L-GR8LH0ouweOfbG2olbkkpPgJ3Fhc7qno17l681T2eZa477yN4eB7tvPPWRjRiecnyb7iiN9nPt7jxADBTmfF9JYliB5Z9_JaOiK1W0w4vSW","status":9237,"sign":"784dbd130e8af64912a838314778d173","loginTime":1569562641288,"stage":2}
     */

    public int uri;
    public Object version;
    public String context;
    public int requestId;
    public int returnCode;
    public Object message;
    public String description;
    public DataBean data;

    public static class DataBean {
        /**
         * uid : 1199517413048
         * passport :
         * subUid : 0
         * regOrigin : 0
         * version : 1.0
         * biztoken : AQAgEujli70_r75E6DDZw4ywplT6PVTtFUWIt56vmt9o4Eu7kxx8Yy0qFtyX7SXk5k-yqYeT_vZXZ7uT95cRkin5erweCyp2KQ6_BdyskKylRMnBk7XCbyJVNNaKfB0J-Sjc4ZVc1ENB9fj5nimj80PtA-JQDrAhY7tmNBzTijZTM1-A7rw3SIiHIC_Ay2nJnglfofLAd8sLWTLldxhxkrQ76SAt-aByN9hMQRriwR6L-GR8LH0ouweOfbG2olbkkpPgJ3Fhc7qno17l681T2eZa477yN4eB7tvPPWRjRiecnyb7iiN9nPt7jxADBTmfF9JYliB5Z9_JaOiK1W0w4vSW
         * status : 9237
         * sign : 784dbd130e8af64912a838314778d173
         * loginTime : 1569562641288
         * stage : 2
         */

        public long uid;
        public String passport;
        public int subUid;
        public int regOrigin;
        public String version;
        public String biztoken;
        public int status;
        public String sign;
        public long loginTime;
        public int stage;

        @Override
        public String toString() {
            return "DataBean{" +
                    "uid=" + uid +
                    ", passport='" + passport + '\'' +
                    ", subUid=" + subUid +
                    ", regOrigin=" + regOrigin +
                    ", version='" + version + '\'' +
                    ", biztoken='" + biztoken + '\'' +
                    ", status=" + status +
                    ", sign='" + sign + '\'' +
                    ", loginTime=" + loginTime +
                    ", stage=" + stage +
                    '}';
        }
    }

    @Override
    public String toString() {
        return "TryQrLoginResponse{" +
                "uri=" + uri +
                ", version=" + version +
                ", context='" + context + '\'' +
                ", requestId=" + requestId +
                ", returnCode=" + returnCode +
                ", message=" + message +
                ", description='" + description + '\'' +
                ", data=" + data +
                '}';
    }
}
