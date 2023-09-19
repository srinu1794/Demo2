package com.example.demo2.service;

import org.springframework.context.annotation.EnableMBeanExport;

public class Employee {
    String name;
    int id;

    String departmentName;
    long mobileNumber;
    String emailId;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public long getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(long mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public static void main(String[] args) {
        Employee employee = new Employee();

        employee.setId(1);
        employee.setName("anusha");
        employee.setDepartmentName("hr");
        employee.setEmailId("hjjj");
        employee.setMobileNumber(3487);
    }




}

