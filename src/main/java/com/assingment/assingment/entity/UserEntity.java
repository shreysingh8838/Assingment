package com.assingment.assingment.entity;
import jakarta.persistence.*;
import lombok.Data;


import java.util.Date;

@Entity
@Data
public class UserEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "UserId", nullable = false)
    private Long userId;

    private String userName;
    private String phoneNumber;
    private String email;
    private Date createdOn;
    private Date changedOn;
    @OneToOne
    @JoinColumn(name = "user_personal_user_personal_id")
    private UserPersonalEntity userPersonalEntity;
}
