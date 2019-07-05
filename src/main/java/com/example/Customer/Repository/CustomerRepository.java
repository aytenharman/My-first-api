package com.example.Customer.Repository;

import java.util.List;
import com.example.Customer.Model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
    List<Customer> findByAge(int age);
    List<Customer> findByName(String name);

}
