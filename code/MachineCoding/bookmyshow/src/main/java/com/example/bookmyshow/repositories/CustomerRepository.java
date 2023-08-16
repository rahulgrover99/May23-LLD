package com.example.bookmyshow.repositories;

import com.example.bookmyshow.models.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {

    @Override
    Optional<Customer> findById(Long aLong);

    Optional<Customer> findCustomerByEmail(String email);

    @Override
    Customer save(Customer customer);
}
