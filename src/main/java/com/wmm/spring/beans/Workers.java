package com.wmm.spring.beans;

public class Workers {
    private String id;
    private String name;
    private Organziation organziation;
    private int salary;

    public void getId() {
        System.out.println(this.name + "的id为：" + this.id);
    }

    public void setId(String id) {
        this.id = id;
    }

    public void getName() {
        System.out.println("职工姓名为："+ this.name);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void getSalary() {
        System.out.println(this.name + "的工资为：" + this.salary);
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void getOrganziation() {
        System.out.println(this.name + "的所属机构为：" + organziation.getOrgName());
    }

    public void setOrganziation(Organziation organziation) {
        this.organziation = organziation;
    }

    public void printThrowException(){
        System.out.println("Exception raised");
        throw new IllegalArgumentException();
    }
}
