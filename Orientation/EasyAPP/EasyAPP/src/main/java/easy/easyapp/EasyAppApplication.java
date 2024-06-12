package easy.easyapp;

import easy.easyapp.models.Person;
import easy.easyapp.repositories.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

 @SpringBootApplication
  public class EasyAppApplication implements CommandLineRunner {

    @Autowired
     PersonRepository repository;

    public static void main(String[] args) {
        SpringApplication.run(EasyAppApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

        for (int i = 0; i < 100; i++) {
            Person p = new Person();
            p.setName("Mark");
            repository.save(p);
        }
        System.out.println("stop");
    }
 }
