package com.tarikyildiz.unitTest.repository;

import com.tarikyildiz.unitTest.model.Customer;

public class CustomerRepository {
    public void addCustomer(Customer customer){
        System.out.println(customer+" added.");
    }
    public void removeCustomer(Integer customerId){
        System.out.println(customerId+" removed!");
    }
    public Customer findCustomer(Integer customerId){
        System.out.println("Find customer");
        return null;
    }
}
