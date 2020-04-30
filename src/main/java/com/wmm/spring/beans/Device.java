package com.wmm.spring.beans;


public class Device {
    private String deviceOnlyId;
    private Organziation organziation;

    public Device(String deviceOnlyId, Organziation organziation) {
        this.deviceOnlyId = deviceOnlyId;
        this.organziation = organziation;
    }

    public void getDeviceOnlyId() {
        System.out.println(deviceOnlyId);
    }

    public void setDeviceOnlyId(String deviceOnlyId) {
        this.deviceOnlyId = deviceOnlyId;
    }

    public void getOrganziation() {
        System.out.println(organziation.getOrgName());
    }

    public void setOrganziation(Organziation organziation) {
        this.organziation = organziation;
    }

    public void editOrganizationName(String name) {
        organziation.setOrgName(name);
        System.out.println("修改后的机构名为: " + organziation.getOrgName());
    }
}
