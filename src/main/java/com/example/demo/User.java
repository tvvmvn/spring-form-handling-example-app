package com.example.demo;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;

public class User {

  @NotEmpty(message = "Email is required")
  @Email
  private String email;

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }
}