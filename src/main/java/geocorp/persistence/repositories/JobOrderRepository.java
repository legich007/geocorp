package geocorp.persistence.repositories;

import geocorp.persistence.entities.Order;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JobOrderRepository extends CrudRepository<Order, Long> {
}
