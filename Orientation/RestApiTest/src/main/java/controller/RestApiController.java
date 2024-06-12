package controller;

import model.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class RestApiController {
    @GetMapping ("/user")
    public List<User> getUsers(){
        return new ArrayList<User>();
    }
}
