package com.assingment.assingment.model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Date;

@Data
public class UserPersonal {
    private String firstName;
    private String middleName;
    private String lastName;
    private String fullName;
    private Date DOB;
    private String Gender;
    private int aadharNo;
}
