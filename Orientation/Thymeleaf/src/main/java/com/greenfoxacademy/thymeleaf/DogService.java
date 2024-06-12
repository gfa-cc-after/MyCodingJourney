package com.greenfoxacademy.thymeleaf;


import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class DogService {
    public List<Dog> dogs = new ArrayList<>();
}