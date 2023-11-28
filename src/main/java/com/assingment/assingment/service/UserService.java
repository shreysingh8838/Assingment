package com.assingment.assingment.service;

import com.assingment.assingment.dao.UserPersonalRepository;
import com.assingment.assingment.dao.UserRepository;
import com.assingment.assingment.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    @Autowired
    private UserPersonalRepository userPersonalRepository;

    public User getUserById(Long id){
        User user = null;
        if(userRepository.findByUserId(id) != null){
            user = userRepository.findByUserId(id);
            if(userPersonalRepository.findByUserId(id) != null ){
                user.setUserPersonal(userPersonalRepository.findByUserId(id));
            }
        }
        return user;
    }
}
