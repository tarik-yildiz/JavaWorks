package com.tarikyildiz.unitTest.services;

import com.tarikyildiz.unitTest.model.Customer;

public class NotificationService {

    public void sendMailToNewCustomer(Customer customer) {
        System.out.println("Mail sent to: "+ customer);
    }
}
