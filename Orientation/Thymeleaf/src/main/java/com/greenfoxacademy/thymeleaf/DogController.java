package com.greenfoxacademy.thymeleaf;

// RestController -> JSON
// Controller -> View (templates)


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.ArrayList;
import java.util.List;

@Controller
public class DogController {

    final DogService dogService;

    public DogController(DogService dogService) {
        this.dogService = dogService;
    }

    @PostMapping("/add")
    public String addDog(Dog dog) {
        this.dogService.dogs.add(dog);
        return "redirect:/";
    }

    @GetMapping("/")
    public String renderDogs(Model model) {
        model.addAttribute("title", "Dog App");
        model.addAttribute("dogs", this.dogService.dogs);
        return "dogs";
    }
}