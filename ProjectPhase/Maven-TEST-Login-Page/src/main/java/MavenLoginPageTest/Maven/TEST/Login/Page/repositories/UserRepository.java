package MavenLoginPageTest.Maven.TEST.Login.Page.repositories;

import MavenLoginPageTest.Maven.TEST.Login.Page.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
