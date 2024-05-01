package br.com.actsoft.customer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class CustomerService {

    private final CustomerRepository customerRepository;

    @Autowired
    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    /**
     * Find All Customers
     */
    public List<Customer> findAll() {
        return customerRepository.findAll();
    }

    /**
     * Find Customer by Name
     */
    public List<Customer> findByName(String name) {
        return customerRepository.findByName(name);
    }

    /**
     * Find Customer by id
     */
    public Optional<Customer> findById(int id) {
        return customerRepository.findById(id);
    }

    /**
     * Create a customer
     */
    public Customer create(Customer customer) {
        return customerRepository.save(customer);
    }

    /**
     * Delete a customer by id
     */
    public void deleteById(Integer id) {
        Optional<Customer> customer = customerRepository.findById(id);
        customer.ifPresent(customerRepository::delete);
    }

    /**
     * Update a Customer
     */
    public Customer update(Customer customer) {
        return (customerRepository.save(customer));
    }

    public int count() {
        return (customerRepository.findAll().size());
    }
}