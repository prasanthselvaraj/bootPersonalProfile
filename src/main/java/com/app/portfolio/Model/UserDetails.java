package com.app.portfolio.Model;

public class UserDetails {
   private String name;
   private String emailId;
   private String phoneNum;
   private String skypeId;
   private String briefId;
   private String status;
   private String respMessage;

    public UserDetails() {

    }

    public UserDetails(String name, String emailId, String phoneNum, String skypeId, String briefId, String status, String respMessage){
        super();
        this.name = name;
        this.emailId = emailId;
        this.phoneNum = phoneNum;
        this.skypeId = skypeId;
        this.briefId = briefId;
        this.status = status;
        this.respMessage = respMessage;
    }

    public String getName() {
        return name;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    public String getSkypeId() {
        return skypeId;
    }

    public void setSkypeId(String skypeId) {
        this.skypeId = skypeId;
    }

    public String getBriefId() {
        return briefId;
    }

    public void setBriefId(String briefId) {
        this.briefId = briefId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getRespMessage() {
        return respMessage;
    }

    public void setRespMessage(String respMessage) {
        this.respMessage = respMessage;
    }
}