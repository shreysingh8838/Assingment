package com.assingment.assingment.dao;
import com.assingment.assingment.entity.UserEntity;


public interface UserRepository {
    public UserEntity findByUserId(Long id);
}
