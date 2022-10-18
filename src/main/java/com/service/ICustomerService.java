package com.service;

import com.model.Customer;

import java.util.List;

public interface ICustomerService {

    List<Customer> findAll();

    Customer findById(int id);
    void createNewCustomer(Customer customer);

    void updateById(int id, Customer customer);

    void deleteById(Customer customer);
}
