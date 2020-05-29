package com.pluralsight.conference.controller;

import com.pluralsight.conference.model.Registration;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;

@Controller
public class RegistrationController {
    @GetMapping("registration")
    public String getRegistration(@ModelAttribute("registration")Registration registration) {
        return "registration"; // it's going to do a lookup to our registration.jsp page
    }
    @PostMapping("registration")
    public String addRegistration(@Valid @ModelAttribute("registration")Registration registration, BindingResult result) {
        if(result.hasErrors()) {
            System.out.println("There were errors!");
            return "registration";
        }
        System.out.println("Registration: "+registration.getName());
        return "redirect:registration"; // it's going to do a lookup to our registration.jsp page
        // redirect will clear out the field
        // post redirect get pattern
    }
}
