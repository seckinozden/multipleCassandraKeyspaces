package com.seckin.customers.repository.tr;

import com.seckin.customers.model.Customer;
import org.springframework.data.cassandra.repository.CassandraRepository;

public interface CustomerRepositoryTR extends CassandraRepository<Customer, Integer> {
}
