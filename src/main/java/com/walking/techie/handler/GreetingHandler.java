package com.walking.techie.handler;

import com.walking.techie.dto.Greeting;
import org.springframework.stereotype.Service;

import java.util.concurrent.atomic.AtomicLong;

@Service
public class GreetingHandler {
  private static final String template = "Hello, %s!";
  private final AtomicLong counter = new AtomicLong();

  public Greeting greeting(String name) {
    Greeting greeting = new Greeting(counter.incrementAndGet(), String.format(template, name));
    return greeting;
  }
}
