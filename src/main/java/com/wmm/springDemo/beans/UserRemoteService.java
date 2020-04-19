package com.wmm.springDemo.beans;

public class UserRemoteService extends baseService{
    private String orgName;

    public void getOrgName() {
        System.out.println("Your orgName : " + orgName);
    }

    public void setOrgName(String orgName) {
        this.orgName = orgName;
    }
}
