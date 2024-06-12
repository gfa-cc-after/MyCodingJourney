package p2pchatappj.p2pchatappj.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import p2pchatappj.p2pchatappj.model.Message;
import p2pchatappj.p2pchatappj.model.User;
import p2pchatappj.p2pchatappj.repository.MessageRepository;
import p2pchatappj.p2pchatappj.repository.UserRepository;

import java.time.LocalDateTime;
import java.util.List;

@Controller
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private MessageRepository messageRepository;

    @GetMapping("/register")
    public String register(Model model) {
        model.addAttribute("user", new User());
        return "register";
    }

    @PostMapping("/register")
    public String registerUser(@RequestParam("username") String username, Model model) {
        System.out.println("Path: /register, Method: POST, Params: username=" + username);

        if (username.isEmpty()) {
            model.addAttribute("error", "The username field is empty");
            System.err.println("The username field is empty");
            return "register";
        }

        User user = new User();
        user.setUsername(username);
        userRepository.save(user);
        model.addAttribute("user", user);
        return "redirect:/?userId=" + user.getId();
    }

    @GetMapping("/")
    public String showIndex(@RequestParam(value = "userId", required = false) Long userId, Model model) {
        if (userId != null) {
            User user = userRepository.findById(userId).orElse(null);
            model.addAttribute("user", user);
        }
        List<Message> messages = messageRepository.findAll();
        model.addAttribute("messages", messages);
        return "index";
    }

    @PostMapping("/update-username")
    public String updateUsername(@RequestParam("userId") Long userId, @RequestParam("username") String username, Model model) {
        User user = userRepository.findById(userId).orElse(null);
        if (user != null) {
            user.setUsername(username);
            userRepository.save(user);
        }
        model.addAttribute("user", user);
        return "index";
    }

    @PostMapping("/add-message")
    public String addMessage(@RequestParam("userId") Long userId, @RequestParam("text") String text, Model model) {
        User user = userRepository.findById(userId).orElse(null);
        if (user != null) {
            Message message = new Message();
            message.setUsername(user.getUsername());
            message.setText(text);
            message.setTimestamp(LocalDateTime.now());
            messageRepository.save(message);
        }
        return "redirect:/?userId=" + userId;
    }

}