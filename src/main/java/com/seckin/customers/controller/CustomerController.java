package com.seckin.customers.controller;

import com.seckin.customers.model.Customer;
import com.seckin.customers.service.CustomerService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerController {

  @Autowired
  CustomerService customerService;

  @GetMapping("/")
  public String welcome() {
    return "Welcome to Customers";
  }

  @GetMapping("/hello")
  public String hello() {
    return "Hello World";
  }

  @GetMapping("/DE/all")
  public List<Customer> getAllCustomersDE() {
    return customerService.getAllCustomersForDE();
  }

  @GetMapping("/TR/all")
  public List<Customer> getAllCustomersTR() {
    return customerService.getAllCustomersForTR();
  }
}
