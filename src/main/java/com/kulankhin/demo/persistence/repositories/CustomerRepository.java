package com.kulankhin.demo.persistence.repositories;

import com.kulankhin.demo.persistence.entities.Customer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends CrudRepository<Customer, Long> {
}
