package com.seckin.customers.service;

import com.seckin.customers.model.Customer;
import com.seckin.customers.repository.de.CustomerRepositoryDE;
import com.seckin.customers.repository.tr.CustomerRepositoryTR;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {

  @Autowired
  CustomerRepositoryDE customerRepositoryDE;

  @Autowired
  CustomerRepositoryTR customerRepositoryTR;

  public List<Customer> getAllCustomersForDE() {
    return customerRepositoryDE.findAll();
  }

  public List<Customer> getAllCustomersForTR(){
    return customerRepositoryTR.findAll();
  }
}
