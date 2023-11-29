package com.assingment.assingment.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class User {
    private String userName;
    private String phoneNumber;
    private String email;
    private UserPersonal userPersonal;
}
