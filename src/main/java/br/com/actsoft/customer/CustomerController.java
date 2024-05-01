package br.com.actsoft.customer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1/customer")
public class CustomerController {

    private final CustomerService customerService;

    @Autowired
    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @GetMapping({"/", ""})
    public List<Customer> getAllCustomers() {
        return this.customerService.findAll();
    }

    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public Customer getCustomerById(@PathVariable int id) {
        Optional<Customer> customer = this.customerService.findById(id);
        if (customer.isPresent()) {
            return customer.get();
        }
        throw new CustomerNotFoundException();
    }

    @PostMapping
    public Customer createCustomer(@RequestBody Customer customer) {
        return this.customerService.create(customer);
    }

    @PutMapping
    public Customer updateCustomer(@RequestBody Customer customer) {
        return this.customerService.update(customer);
    }

    @DeleteMapping("/{id}")
    public void deleteCustomer(@PathVariable int id) {
        this.customerService.deleteById(id);
    }
}