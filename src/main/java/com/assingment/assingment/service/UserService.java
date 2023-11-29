package com.assingment.assingment.service;

import com.assingment.assingment.dao.UserPersonalRepository;
import com.assingment.assingment.dao.UserRepository;
import com.assingment.assingment.entity.UserEntity;
import com.assingment.assingment.entity.UserPersonalEntity;
import com.assingment.assingment.mapper.dto.UserMapper;
import com.assingment.assingment.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    @Autowired
    private UserPersonalRepository userPersonalRepository;

//    public UserEntity getUserById(Long id){
//        UserEntity userEntity = userRepository.findByUserId(id);
//        if(userEntity != null){
//            UserPersonalEntity userPersonalEntity = userPersonalRepository.findByUserId(id);
//            if(userPersonalEntity != null ){
//                userEntity.setUserPersonalEntity(userPersonalEntity);
//            }
//        }
//        return userEntity;
//    }

    public User getUserById(Long id){
        User user = new User();
        UserMapper userMapper = new UserMapper();
        UserEntity userEntity = userRepository.findByUserId(id);
        if(userEntity != null){
            UserPersonalEntity userPersonalEntity = userPersonalRepository.findByUserId(id);
            if(userPersonalEntity != null ){
                userEntity.setUserPersonalEntity(userPersonalEntity);
                user = userMapper.mapUser(userEntity, userPersonalEntity);
            }
        }
        return user;
    }
}
