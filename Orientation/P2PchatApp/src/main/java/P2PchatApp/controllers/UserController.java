package P2PchatApp.controllers;

import P2PchatApp.services.UserServices;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequiredArgsConstructor
public class UserController {
    private final UserServices userServices;

    // mapping to show main page register/login
    @GetMapping("/")
    public String showMainPage(){
        return "main";
    }


    @GetMapping("/register")
    public String showRegistrationForm() {
        return "register"; // Return the register.html template
    }


        // OLD postmapping without error on empty register fields
   @PostMapping("/register")
    public String registerUser(@RequestParam String username, @RequestParam String password) {
        userServices.registerUser(username,password);
        return "redirect:/login";  //redirecting to login page
    }

    @GetMapping("/login")
        public String showLoginForm(Model model) {
        model.addAttribute("error",""); // error message is empty initially
    return "login";
    }

    @PostMapping("/login")
    public String loginUser(@RequestParam String username, @RequestParam String password, Model model) {
        boolean loginSuccessful = userServices.loginUser(username,password);
        if(loginSuccessful){
            return "redirect:/chatpage"; //redirect to chat page after login
        } else {
            model.addAttribute("error", "Invalid username or password");
            return "login";
        }
    }

    @GetMapping("/chatpage")
    public String showChatpage(){
        return "chatpage";
    }

}
