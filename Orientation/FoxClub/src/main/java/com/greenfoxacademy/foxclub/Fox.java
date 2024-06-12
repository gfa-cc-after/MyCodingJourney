package com.greenfoxacademy.foxclub;

import java.util.ArrayList;
import java.util.List;

public class Fox {
    private String name;
    private List<String> tricks;
    private String food;
    private String drink;

    public Fox(String name) {
        this.name = name;
        this.tricks = new ArrayList<>();
        this.food = "salad"; // Initial food for Mr. Green
        this.drink = "water"; // Initial drink for Mr. Green
    }

    // Getters and setters for name, tricks, food, and drink

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getTricks() {
        return tricks;
    }

    public void setTricks(List<String> tricks) {
        this.tricks = tricks;
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public String getDrink() {
        return drink;
    }

    public void setDrink(String drink) {
        this.drink = drink;
    }

    // Method to learn a new trick
    public void learnTrick(String trick) {
        if (!tricks.contains(trick)) {
            tricks.add(trick);
        }
    }

    // Method to eat food
    public void eatFood(String newFood) {
        this.food = newFood;
    }

    // Method to drink
    public void drink(String newDrink) {
        this.drink = newDrink;
    }
}
