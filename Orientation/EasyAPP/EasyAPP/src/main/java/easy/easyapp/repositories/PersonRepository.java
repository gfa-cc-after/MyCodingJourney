package easy.easyapp.repositories;

import easy.easyapp.models.Person;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PersonRepository extends JpaRepository<Person,Long> {

    //JPQL >>> java persistence querz language
    List<Person> findAllByNameContaining(String partial);

    List<Person> findByNameEndingWith(String string);
}
