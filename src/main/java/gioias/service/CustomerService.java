package gioias.service;

import gioias.entity.Customer;
import gioias.repository.CustomerRepository;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

import java.util.List;

@ApplicationScoped
public class CustomerService {
    @Inject
    CustomerRepository customerRepository;

    public List<Customer> findALlCustomers(){
        return customerRepository.findAll().list();
    }

    public void addCustomer(Customer customer) {
        customerRepository.persist(customer);
    }
}
