package ToDoApplication;

import ToDoApplication.Repositories.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TodoApplication   {


    public static void main(String[] args) {
        SpringApplication.run(TodoApplication.class, args);
    }


}