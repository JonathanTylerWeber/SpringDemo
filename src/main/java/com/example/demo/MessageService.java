package com.example.demo;

import org.springframework.stereotype.Service;

@Service
public class MessageService {
  public String getMessage(){
    return "Hello from the messageService bean";
  }
}
