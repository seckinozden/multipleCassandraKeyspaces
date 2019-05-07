package com.seckin.customers.repository.de;

import com.seckin.customers.model.Customer;
import org.springframework.data.cassandra.repository.CassandraRepository;


public interface CustomerRepositoryDE extends CassandraRepository<Customer, Integer> {
}
