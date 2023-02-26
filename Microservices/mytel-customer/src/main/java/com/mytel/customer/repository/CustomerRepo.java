package com.mytel.customer.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mytel.customer.entity.Customer;

public interface CustomerRepo extends JpaRepository<Customer, Long> {

}
