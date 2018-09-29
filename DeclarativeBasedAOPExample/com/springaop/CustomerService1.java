package com.springaop;

public class CustomerService1 {
    private String name;
    private String address;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void printName(){
        System.out.println("Customer Name:"+this.name);
    }
    public void printAddress(){
        System.out.println("Customer Address:"+this.address);
    }

    public void printThrowsException(){
        throw new IllegalArgumentException();
    }
}
