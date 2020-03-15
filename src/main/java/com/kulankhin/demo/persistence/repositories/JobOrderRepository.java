package com.kulankhin.demo.persistence.repositories;

import com.kulankhin.demo.persistence.entities.JobOrder;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JobOrderRepository extends CrudRepository<JobOrder, Long> {
}
