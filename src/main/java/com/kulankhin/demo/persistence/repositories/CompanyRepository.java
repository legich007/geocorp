package com.kulankhin.demo.persistence.repositories;

import com.kulankhin.demo.persistence.entities.Company;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CompanyRepository extends CrudRepository<Company, Long> {
}
