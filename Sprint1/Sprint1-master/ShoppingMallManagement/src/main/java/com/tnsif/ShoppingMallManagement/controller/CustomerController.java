package com.tnsif.ShoppingMallManagement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.tnsif.ShoppingMallManagement.entity.Customer;
import com.tnsif.ShoppingMallManagement.repository.CustomerRepository;

@RestController

public class CustomerController {
	@Autowired
	CustomerRepository repo;
 @PostMapping("/Customer")
	public Customer addcustomer (@RequestBody Customer c)
	{

	  return repo.save(c);
	 	
	}
 @GetMapping("/Customer")
 	public List<Customer> getCustomer ()
 	{
 		return repo.findAll();
 	}
 	
 @GetMapping("/Customer/{Id}")
 	public Customer getCustomerbyId(@PathVariable Integer Id)
 	
 	{
 	return 	repo.findById(Id).get();
 	}
  @DeleteMapping("/Customer/{Id}")
 public void deleteCustomer(@PathVariable Integer Id)
 {
	 repo.deleteById(Id);
 }
  @PutMapping("/Customer/{Id}")
  public Customer updateCustomer(@PathVariable Long Id,@RequestBody Customer c, Object C)
  {
	  c.setId(Id);
	return repo.save(c);
  }
}

