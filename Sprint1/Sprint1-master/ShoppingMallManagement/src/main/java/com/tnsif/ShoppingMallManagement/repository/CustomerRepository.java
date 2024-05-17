package com.tnsif.ShoppingMallManagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tnsif.ShoppingMallManagement.entity.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Integer>{

}
