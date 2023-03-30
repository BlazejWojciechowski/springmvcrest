package blaze.spring.springmvcrest.controllers;

import blaze.spring.springmvcrest.domain.Customer;
import blaze.spring.springmvcrest.services.CustomerService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(CustomerController.BASE_URL)
public class CustomerController {

    public static final String BASE_URL = "/api/v1/customers";

    private final CustomerService customerService;

    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @GetMapping("")
    List<Customer> getAllCustomers() {
        return customerService.findAllCustomers();
    }
}
