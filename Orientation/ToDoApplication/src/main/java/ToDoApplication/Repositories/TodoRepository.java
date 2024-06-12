package ToDoApplication.Repositories;

import ToDoApplication.Models.ToDo;
import org.springframework.data.repository.CrudRepository;

import java.util.ArrayList;
import java.util.List;


public interface TodoRepository extends CrudRepository<ToDo, Long> {
    public List<ToDo> Todos = new ArrayList<>();
}
 // Create a new interface which extends CrudRepository<Todo, Long>