package RedditProject.controller;

import RedditProject.services.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import lombok.RequiredArgsConstructor;
import org.springframework.ui.Model;

@Controller
@RequiredArgsConstructor
public class UserController {
    private final UserService userService;

    // Mapping to display the registration form
    @GetMapping("/register")
    public String showRegistrationForm() {
        return "register"; // Return the register.html template
    }

    // Mapping to display the login form
    @GetMapping("/login")
    public String showLoginForm(Model model) {
        model.addAttribute("error", ""); // Ensure error message is empty initially
        return "login"; // Return the login.html template
    }

    // Mapping to handle user registration
    @PostMapping("/register")
    public String registerUser(@RequestParam String username, @RequestParam String password) {
        userService.registerUser(username, password);
        return "redirect:/login"; // Redirect to the login page
    }

    // Mapping to handle user login
    @PostMapping("/login")
    public String loginUser(@RequestParam String username, @RequestParam String password, Model model) {
        boolean loginSuccessful = userService.loginUser(username, password);
        if (loginSuccessful) {
            return "redirect:/posts"; // Redirect to the list of posts
        } else {
            model.addAttribute("error", "Invalid username or password");
            return "login"; // Return the login.html template with an error message
        }
    }
}
