package com.springaop;

public class CustomerService {
    private String name;
    private String address;

    public void setName(String name) {
        this.name = name;
    }
    public void setAddress(String address) {
        this.address = address;
    }

    public void printName() {
        System.out.println("Customer name : " + this.name);
    }

    public void printAddress() {
        System.out.println("Customer website : " + this.address);
    }

    public void printThrowException() {
        throw new IllegalArgumentException();
    }
}
