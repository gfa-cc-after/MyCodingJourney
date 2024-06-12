package Memories.controllers;


import Memories.CreateMemoryDTO;
import Memories.services.MemoryService;
import lombok.RequiredArgsConstructor;

import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@RequiredArgsConstructor
public class MemoryController {

    private final MemoryService memoryService;

    @GetMapping("/")
    public String renderIndex(Model model, Pageable pageable) {
        if (pageable == null) {
            pageable = Pageable.ofSize(10).withPage(0);
        }
        model.addAttribute("memories", memoryService.findAll(pageable).getContent());
        model.addAttribute("newMemory", new CreateMemoryDTO());
        model.addAttribute("pageInfo", pageable);
        return "index";
    }

    @PostMapping("/")
    public String addMemory(@ModelAttribute(name = "newMemory") CreateMemoryDTO createMemoryDTO) {
        memoryService.add(createMemoryDTO);
        return "redirect:/";
    }

    @GetMapping("/vote/{id}/up")
    public String upVoteById(@PathVariable Long id) {
        memoryService.increaseVoteOf(id);
        return "redirect:/";
    }

    @GetMapping("/vote/{id}/down")
    public String downVoteById(@PathVariable Long id) {
        memoryService.decreaseVoteOf(id);
        return "redirect:/";
    }
}