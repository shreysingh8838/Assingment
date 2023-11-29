package com.assingment.assingment.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Date;

@Entity
@Getter
@Setter
@ToString
public class UserPersonalEntity {

    public UserPersonalEntity() {
    }

    public UserPersonalEntity(String firstName, String middleName, String lastName, Date dob, String gender, String aadharNo) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.dob = dob;
        this.gender = gender;
        this.aadharId = aadharId;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "UserPersonalId", nullable = false)
    private Long userPersonalId;

    private Long userId;
    private String firstName;
    private String middleName;
    private String lastName;

    private String fullName;
    private Date dob;

    private String gender;
    private String aadharId;

}
