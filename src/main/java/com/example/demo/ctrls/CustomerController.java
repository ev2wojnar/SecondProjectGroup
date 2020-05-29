package com.example.demo.ctrls;

import com.example.demo.model.Customer;
import com.example.demo.services.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @GetMapping("/cinemas/customers/{customerId}")
    public Customer findCustomer(@PathVariable long customerId){
        return customerService.findCustomerById(customerId);
    }
}
