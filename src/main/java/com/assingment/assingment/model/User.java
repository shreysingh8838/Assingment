package com.assingment.assingment.model;

import lombok.Data;


@Data
public class User {
    private String userName;
    private String phoneNumber;
    private String email;
    private UserPersonal userPersonal;
}
