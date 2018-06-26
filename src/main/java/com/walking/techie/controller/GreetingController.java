package com.walking.techie.controller;

import com.walking.techie.dto.Greeting;
import com.walking.techie.handler.GreetingHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

  @Autowired private GreetingHandler greetingHandler;

  @GetMapping("/greeting")
  public Greeting sayHello(@RequestParam(value = "name", defaultValue = "World") String name) {
    return greetingHandler.greeting(name);
  }
}