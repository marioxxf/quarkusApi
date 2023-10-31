package gioias.controller;

import gioias.entity.Customer;
import gioias.service.CustomerService;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;

import java.util.ArrayList;
import java.util.List;

@Path("/api/customer")
public class CustomerController {
    @Inject
    CustomerService customerService;

    @GET
    public List<Customer> retrieveCustomers(){
        List<Customer> customers = new ArrayList<>();
        try {
            customers = customerService.findALlCustomers();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return customers;
    }

    @POST
    @Transactional
    public void addCustomer(Customer customer) {
        customerService.addCustomer(customer);
    }
}