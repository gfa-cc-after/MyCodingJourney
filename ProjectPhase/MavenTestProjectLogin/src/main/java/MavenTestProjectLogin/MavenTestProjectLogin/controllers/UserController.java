package MavenTestProjectLogin.MavenTestProjectLogin.controllers;

import MavenTestProjectLogin.MavenTestProjectLogin.models.User;
import MavenTestProjectLogin.MavenTestProjectLogin.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/users")
public class UserController {

    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping
    public ResponseEntity<User> createUser(@RequestBody User user) {
        User createdUser = userService.createUser(user);
        return new ResponseEntity<>(createdUser, HttpStatus.CREATED);
    }

    @ControllerAdvice
    public class GlobalExceptionHandler {

        @ExceptionHandler(HttpMessageNotReadableException.class)
        public ResponseEntity<String> handleHttpMessageNotReadableException(HttpMessageNotReadableException ex) {
            return new ResponseEntity<>("Required request body is missing or unreadable: " + ex.getMessage(), HttpStatus.BAD_REQUEST);

        }       }
}
