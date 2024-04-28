package com.workintech.ecomgg.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Login {
    private Long id;
    private String writer;
    private String description;
}
