package com.assingment.assingment.dao;

import com.assingment.assingment.entity.UserPersonal;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface UserPersonalRepository {
    public UserPersonal findByUserId(Long id);
}
