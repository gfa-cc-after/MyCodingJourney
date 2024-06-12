package com.greenfoxacademy.foxclub;
/*
public class Test {
    @GetMapping("/login")
    public String showLoginForm(Model model, @RequestParam(required = false) String error) {
        model.addAttribute("error", error != null);
        return "login";
    }

    @PostMapping("/login")
    public String login(@RequestParam String name, RedirectAttributes redirectAttributes) {
        // Check if name is new or existing (replace this logic with your implementation)
        boolean isNewName = checkIfNewName(name);

        if (isNewName) {
            return "redirect:/login?error=true";
        } else {
            redirectAttributes.addAttribute("name", name);
            return "redirect:/?name=" + name;
        }
    }

    // Replace this method with your logic to check if the provided name is new
    private boolean checkIfNewName(String name) {
        // Example logic
        return false;
    }
}
*/