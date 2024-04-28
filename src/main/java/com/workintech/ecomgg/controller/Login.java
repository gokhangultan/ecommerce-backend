package com.workintech.ecomgg.controller;

import jakarta.annotation.PostConstruct;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/login")
@CrossOrigin("http://localhost:5173")
public class Login {

    private Map<Long, com.workintech.ecomgg.entity.Login> loginMap;

    @PostConstruct
    public void init(){
        loginMap = new HashMap<>();
    }

    @PostMapping("/")
    public com.workintech.ecomgg.entity.Login save(@RequestBody com.workintech.ecomgg.entity.Login user){
        loginMap.put(user.getId(), user);
        return user;
    }

    @GetMapping("/")
    public List<com.workintech.ecomgg.entity.Login> findAll(){
        return loginMap.values().stream().toList();
    }

}
