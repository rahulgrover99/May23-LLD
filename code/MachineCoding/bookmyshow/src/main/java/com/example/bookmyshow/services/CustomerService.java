package com.example.bookmyshow.services;

import com.example.bookmyshow.models.Customer;
import com.example.bookmyshow.repositories.CustomerRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
@AllArgsConstructor
public class CustomerService {
    private CustomerRepository customerRepository;

    public Customer signUp(String name, String email) {
        System.out.println("Service layer called for creating customer.");

        Customer customer = new Customer();
        customer.setName(name);
        customer.setEmail(email);
        customer.setBookings(new ArrayList<>());

        // Call the repository layer and try to save that to DB.
        customerRepository.save(customer);

        return customer;
    }

}
