package geocorp.persistence.repositories;

import geocorp.persistence.entities.JobPosition;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JobPositionRepository extends CrudRepository<JobPosition, Long> {
}
