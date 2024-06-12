package JPA_advanced_onetomany.repositories;

import JPA_advanced_onetomany.models.Cart;
import org.springframework.data.repository.CrudRepository;

public interface CartRepository extends CrudRepository<Cart, Long> {
}
