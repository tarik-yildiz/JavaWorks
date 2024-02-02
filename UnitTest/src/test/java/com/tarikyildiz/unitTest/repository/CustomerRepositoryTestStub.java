package com.tarikyildiz.unitTest.repository;


import com.tarikyildiz.unitTest.model.Customer;

import java.util.HashMap;
import java.util.Map;

public class CustomerRepositoryTestStub extends CustomerRepository {
    private Map<Integer,Customer> customerMap=new HashMap<Integer,Customer>();
    @Override
    public void addCustomer(Customer customer) {
        customerMap.put(customer.getCustomerId(),customer);
    }

    @Override
    public void removeCustomer(Integer customerId) {
        customerMap.remove(customerId);
    }

    @Override
    public Customer findCustomer(Integer customerId) {
        return  customerMap.get(customerId);
    }

    public Map<Integer, Customer> getCustomerMap() {
        return customerMap;
    }
}