package p2pchatappj.p2pchatappj.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import p2pchatappj.p2pchatappj.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}