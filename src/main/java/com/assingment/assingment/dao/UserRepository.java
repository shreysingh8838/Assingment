package com.assingment.assingment.dao;
import com.assingment.assingment.entity.UserEntity;

import java.util.List;


public interface UserRepository {
    public UserEntity findByUserId(Long id);

    public List<UserEntity> findAllUsers();
}
