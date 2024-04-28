package com.workintech.ecomgg.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class SignUp {
    private Long id;
    private String username;
    private String email;
    private String password;
}
