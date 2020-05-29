package com.pluralsight.conference.controller;

import com.pluralsight.conference.model.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController
{
        @GetMapping("/user")
        public User getUser(@RequestParam(value = "firstname", defaultValue = "Cristina") String firstname,
                            @RequestParam(value = "lastname", defaultValue = "Sirbu") String lastname,
                            @RequestParam(value = "age", defaultValue = "25") int age) {
                User user = new User();
                user.setFirstname(firstname);
                user.setLastname(lastname);
                user.setAge(age);
                return user;
        }

        @PostMapping("/user")
        public User posttUser(User user) {
                System.out.println("User first name: "+user.getFirstname());
                System.out.println("User last name: "+user.getLastname());
                System.out.println("User age: "+user.getAge());
                return user;
        }
}
