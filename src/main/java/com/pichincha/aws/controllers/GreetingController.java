package com.pichincha.aws.controllers;

import com.pichincha.aws.dto.Greeting;
import java.util.concurrent.atomic.AtomicLong;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {


  private final AtomicLong counter = new AtomicLong();

  @GetMapping("/")
  public Greeting greeting() {
    return new Greeting(counter.incrementAndGet());
  }

}
