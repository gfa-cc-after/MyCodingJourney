package com.greenfoxacademy.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Controller
@SpringBootApplication
public class SpringbootApplication {
    List<Person> people = new ArrayList<>();
    public static void main(String[] args) {
        SpringApplication.run(SpringbootApplication.class, args);
    }
    // https://localhost:8080/here?name=Rene >> queryParameter
    @GetMapping("/here")
    @ResponseBody
    public String renderHere(@RequestParam( name = "name", required=false)  String name) {
        if (this.people.stream().noneMatch(p -> p.name.equals(name))){
            people.add(new Person(name));
        }
    StringBuilder htmlcCreator1 = new StringBuilder();
    htmlcCreator1.append("""
            <!doctype html>
              <html lang="en">
              <head>
                  <meta charset="UTF-8">
                  <meta name="viewport"
                        content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
                  <meta http-equiv="X-UA-Compatible" content="ie=edge">
                  <title>Attendance tracker</title>
              </head>
              <body>
                """);
    htmlcCreator1.append("<ul>");
    for( Person p: people) {
        htmlcCreator1.append("<li>");
        htmlcCreator1.append(p.name);
        htmlcCreator1.append("</li>");
    }
    htmlcCreator1.append("</ul>");

    htmlcCreator1.append("""
              </body>
              </html>
                """);
        return "hello" + htmlcCreator1.toString();
    }
}
