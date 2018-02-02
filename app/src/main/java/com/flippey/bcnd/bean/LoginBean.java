package com.flippey.bcnd.bean;

/**
 * Created by flippey on 2018/2/2 16:59.
 */

public class LoginBean {

    /**
     * code : 0
     * message : success
     * data : {"token":"eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJleHAiOjE1MTc1NzYyMTcsImlzcyI6InRlc3QiLCJuYmYiOjE1MTc1NDc0MTd9.tQZKMSVvYy5p_bxmb3-OU1cIsAiPLXMPyoEE0q2HbUw","phonenumber":"13166085526","userid":"d394c025-3257-4b1e-8434-4c7229be15f2","imgurl":"http://47.52.207.212:9090/user/imghead/d394c025-3257-4b1e-8434-4c7229be15f2/user.img","areacode":"86","ethAddress":"0xDDea05A34D05E6008201f871fE6541d38c6Ad303"}
     */

    private int code;
    private String message;
    private DataBean data;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public DataBean getData() {
        return data;
    }

    public void setData(DataBean data) {
        this.data = data;
    }

    public static class DataBean {
        /**
         * token : eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJleHAiOjE1MTc1NzYyMTcsImlzcyI6InRlc3QiLCJuYmYiOjE1MTc1NDc0MTd9.tQZKMSVvYy5p_bxmb3-OU1cIsAiPLXMPyoEE0q2HbUw
         * phonenumber : 13166085526
         * userid : d394c025-3257-4b1e-8434-4c7229be15f2
         * imgurl : http://47.52.207.212:9090/user/imghead/d394c025-3257-4b1e-8434-4c7229be15f2/user.img
         * areacode : 86
         * ethAddress : 0xDDea05A34D05E6008201f871fE6541d38c6Ad303
         */

        private String token;
        private String phonenumber;
        private String userid;
        private String imgurl;
        private String areacode;
        private String ethAddress;

        public String getToken() {
            return token;
        }

        public void setToken(String token) {
            this.token = token;
        }

        public String getPhonenumber() {
            return phonenumber;
        }

        public void setPhonenumber(String phonenumber) {
            this.phonenumber = phonenumber;
        }

        public String getUserid() {
            return userid;
        }

        public void setUserid(String userid) {
            this.userid = userid;
        }

        public String getImgurl() {
            return imgurl;
        }

        public void setImgurl(String imgurl) {
            this.imgurl = imgurl;
        }

        public String getAreacode() {
            return areacode;
        }

        public void setAreacode(String areacode) {
            this.areacode = areacode;
        }

        public String getEthAddress() {
            return ethAddress;
        }

        public void setEthAddress(String ethAddress) {
            this.ethAddress = ethAddress;
        }
    }
}
