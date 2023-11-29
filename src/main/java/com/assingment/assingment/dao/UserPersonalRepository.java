package com.assingment.assingment.dao;

import com.assingment.assingment.entity.UserPersonalEntity;

public interface UserPersonalRepository {
    public UserPersonalEntity findByUserId(Long id);
}
