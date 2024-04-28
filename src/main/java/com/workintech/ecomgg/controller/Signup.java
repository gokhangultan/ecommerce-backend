package com.workintech.ecomgg.controller;

import jakarta.annotation.PostConstruct;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/signup")
@CrossOrigin("http://localhost:5173")
public class Signup {

    private Map<Long, com.workintech.ecomgg.entity.SignUp> signUpMap;

    @PostConstruct
    public void init(){
        signUpMap = new HashMap<>();
    }

    @PostMapping("/")
    public com.workintech.ecomgg.entity.SignUp save(@RequestBody com.workintech.ecomgg.entity.SignUp user){
        signUpMap.put(user.getId(), user);
        return user;
    }

    @GetMapping("/")
    public List<com.workintech.ecomgg.entity.SignUp> findAll(){
       return signUpMap.values().stream().toList();
    }

}
