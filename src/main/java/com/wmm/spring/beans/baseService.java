package com.wmm.spring.beans;

public abstract class baseService {
    private String serviceID;
    private User user;

    public void getServiceID() {
        System.out.println("Your serviceID : " + serviceID);
    }

    public void setServiceID(String serviceID) {
        this.serviceID = serviceID;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
