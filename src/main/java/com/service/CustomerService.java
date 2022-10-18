package com.service;

import com.model.Customer;

import java.util.ArrayList;
import java.util.List;

public class CustomerService implements ICustomerService{
    static List<Customer> customers;

    static {
        customers = new ArrayList<>();
        customers.add(new Customer(1, "Hoang Hieu", "xuanhieuvn@gmail.com", "Hai Duong"));
        customers.add(new Customer(2, "Huy Trung", "trungtashi@gmail.com", "Bac Giang"));
        customers.add(new Customer(3, "Thanh Vinh", "vinhl@gmail.com", "Hue"));
        customers.add(new Customer(4, "Phan Han", "hanhan@gmail.com", "Ha Noi"));
        customers.add(new Customer(5, "Minh Tuan", "minhtuan@gmail.com", "Ha Tien"));

    }

    @Override
    public List<Customer> findAll() {
        return customers;
    }

    @Override
    public Customer findById(int id) {
        int index = -1;
        for (int i = 0; i < customers.size(); i++) {
            if (customers.get(i).getId()==id){
                index = i;
                return customers.get(index);
            }
        }
        return null;
    }

    @Override
    public void createNewCustomer(Customer customer) {
        customers.add(customer);
    }

    @Override
    public void updateById(int id, Customer customer) {
        customers.set(id,customer);
    }

    @Override
    public void deleteById(Customer customer) {
        customers.remove(customer);
    }
}
