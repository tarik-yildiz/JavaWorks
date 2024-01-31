package com.tarikyildiz.unitTest.model;

public class Customer {
    Integer customerId;

    public Customer(Integer customerId) {
        this.customerId = customerId;
    }

    public Integer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "customerId=" + customerId +
                '}';
    }
}
