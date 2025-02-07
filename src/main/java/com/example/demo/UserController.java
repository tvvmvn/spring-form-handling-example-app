package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import jakarta.validation.Valid;

@Controller
public class UserController {

  @GetMapping("/")
  public String greetingForm(Model model) {

    User user = new User();

    model.addAttribute("user", user);
    
    return "form";
  }

  @PostMapping("/save")
  public String greetingSubmit(@Valid User user, BindingResult bindingResult) {
    
    if (bindingResult.hasErrors()) {
      return "form";
    }

    // save user in db..
    
    return "result";
  }
}
