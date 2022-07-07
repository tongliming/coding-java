package com.liming.entity;

import lombok.Data;

import java.io.Serializable;

@Data
public class User implements Serializable {
    private static final long serialVersionUID = 3487840980524361912L;
    private Long id;
    private String name;
    private Integer age;
    private String email;
}
