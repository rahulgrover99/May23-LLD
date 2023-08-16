package com.example.bookmyshow.controllers;

import com.example.bookmyshow.dtos.CreateCustomerRequest;
import com.example.bookmyshow.dtos.CreateCustomerResponse;
import com.example.bookmyshow.models.Customer;
import com.example.bookmyshow.services.CustomerService;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/bms/v1")
@AllArgsConstructor
public class CustomerController {

    // No beans of 'CustomerService' type found
    // if service not annotated with @Service
    private final CustomerService customerService;

    @PostMapping(path = "/customers")
    public CreateCustomerResponse createCustomer(@RequestBody CreateCustomerRequest request) {
        System.out.println("Received a request for creating customer.");
        System.out.println(request.toString());
        Customer customer = customerService.signUp(request.getName(), request.getEmail(), request.getPassword());
        return new CreateCustomerResponse("OK", customer.getId());
    }




}
