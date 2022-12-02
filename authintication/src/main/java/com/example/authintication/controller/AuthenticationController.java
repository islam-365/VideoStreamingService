package com.example.authintication.controller;


import com.example.authintication.pojo.Account;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthenticationController {


    @PostMapping("/")
    public Boolean authenticate(@RequestBody Account account){
            return account.getUsername().equals("islam") && account.getPassword().equals("islam");
    }
}
