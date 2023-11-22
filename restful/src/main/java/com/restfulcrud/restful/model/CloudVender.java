package com.restfulcrud.restful.model;

public class CloudVender {

    //variables
    private String venderId;
    private String venderName;
    private String venderAdd;
    private String phoneNo;

    public CloudVender() {
    }

    public CloudVender(String venderId, String venderName, String venderAdd, String phoneNo) {
        this.venderId = venderId;
        this.venderName = venderName;
        this.venderAdd = venderAdd;
        this.phoneNo = phoneNo;
    }

    public String getVenderId() {
        return venderId;
    }

    public void setVenderId(String venderId) {
        this.venderId = venderId;
    }

    public String getVenderName() {
        return venderName;
    }

    public void setVenderName(String venderName) {
        this.venderName = venderName;
    }

    public String getVenderAdd() {
        return venderAdd;
    }

    public void setVenderAdd(String venderAdd) {
        this.venderAdd = venderAdd;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }
}
