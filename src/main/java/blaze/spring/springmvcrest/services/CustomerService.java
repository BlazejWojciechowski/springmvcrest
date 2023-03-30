package blaze.spring.springmvcrest.services;

import blaze.spring.springmvcrest.domain.Customer;

import java.util.List;

public interface CustomerService {

    Customer findCustomerById(Long id);

    List<Customer> findAllCustomers();
}
