package com.java.springazuredemo.controlller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DisplayMessage {
   @GetMapping("/message")
    public String displayMessage(){
            return "Successfully deployed in azure";
    }
}
