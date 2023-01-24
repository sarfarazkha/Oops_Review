package com.bridgelabz.oops;

public class Employee {
    private String name;
    private int age;
    private long phoneNumber;
    private String state;
    private String department;


    Employee() {

    }

    public Employee(String name, int age, long phoneNumber, String state, String department) {
        this.name = name;
        this.age = age;
        this.phoneNumber = phoneNumber;
        this.state = state;
        this.department = department;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}
