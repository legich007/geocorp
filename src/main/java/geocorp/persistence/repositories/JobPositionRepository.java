package geocorp.persistence.repositories;

import geocorp.persistence.entities.Position;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JobPositionRepository extends CrudRepository<Position, Long> {
}
