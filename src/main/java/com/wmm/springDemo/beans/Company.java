package com.wmm.springDemo.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Required;

public class Company {
    private String id;

    private String name;

    private Address address;

    @Autowired
    public Company(Address address) {
        this.address = address;
    }

    public String getId() {
        return id;
    }

    @Autowired(required = false)
    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    @Autowired(required = false)
    public void setName(String name) {
        this.name = name;
    }

    public void getAddress() {
        System.out.println(address.getLocation());
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
