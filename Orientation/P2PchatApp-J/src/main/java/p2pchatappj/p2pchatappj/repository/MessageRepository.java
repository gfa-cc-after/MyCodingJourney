package p2pchatappj.p2pchatappj.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import p2pchatappj.p2pchatappj.model.Message;

public interface MessageRepository extends JpaRepository<Message, Long> {
}