package ToDoApplication.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TodoController {
    @GetMapping("/todo")
    public String test() {
        return "todolist";
    }
}
