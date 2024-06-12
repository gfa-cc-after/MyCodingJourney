package com.greenfoxacademy.bankofsimba;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
public class BankController {

    private List<BankAccount> bankAccounts = new ArrayList<>();

    public BankController() {
        // Populate bank accounts list with initial data
        bankAccounts.add(new BankAccount("Simba", 2000, "lion"));
        bankAccounts.add(new BankAccount("Nala", 1500, "lioness"));
        bankAccounts.add(new BankAccount("Timon", 500, "meerkat"));
        bankAccounts.add(new BankAccount("Pumbaa", 700, "warthog"));
        bankAccounts.add(new BankAccount("Shenzi", 10000, "hyena"));
        bankAccounts.add(new BankAccount("Amer", 10, "hyena"));
    }

    @GetMapping("/show")
    public String showBankAccount(Model model) {
        BankAccount bankAccount = new BankAccount("Simba", 2000, "lion");
        model.addAttribute("bankAccount", bankAccount);
        return "bankaccount";
    }

    @GetMapping("/showAll")
    public String showAllBankAccounts(Model model) {
        model.addAttribute("bankAccounts", bankAccounts);
        return "allbankaccounts";
    }

    @PostMapping("/raiseBalance")
    public String raiseBalance(@RequestParam("accountIndex") int accountIndex) {
        try {
            BankAccount account = bankAccounts.get(accountIndex);
            if (account.getAnimalType().equals("lion")) {
                account.setBalance(account.getBalance() + 100); // Increment balance by 100 for kings
            } else {
                account.setBalance(account.getBalance() + 10); // Increment balance by 10 for other animals
            }
            return "redirect:/showAll";
        } catch (IndexOutOfBoundsException e) {
            // Handle index out of bounds exception
            return "error";
        }
    }

    }

