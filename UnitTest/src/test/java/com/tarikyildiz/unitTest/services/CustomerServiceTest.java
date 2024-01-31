package com.tarikyildiz.unitTest.services;

import com.tarikyildiz.unitTest.model.Customer;
import com.tarikyildiz.unitTest.repository.CustomerRepository;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.*;


public class CustomerServiceTest {
    private CustomerService customerService;
    private CustomerRepository customerRepository;
    private NotificationService notificationService;

    @Before
    public void setUp() {
        customerService = new CustomerService();
        customerRepository = Mockito.mock(CustomerRepository.class);
        notificationService=Mockito.mock(NotificationService.class);
        customerService.setCustomerRepository(customerRepository);
        customerService.setNotificationService(notificationService);
    }
    @Test
    public void testAddCustomer(){
        Customer customer=new Customer(1);
        customerService.addCustomer(customer);
        Mockito.verify(customerRepository).addCustomer(customer);
        Mockito.verify(notificationService).sendMailToNewCustomer(customer);
    }
}