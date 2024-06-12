package JPA_advanced_onetomany.repositories;

import JPA_advanced_onetomany.models.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {
}
