package com.assingment.assingment.service;

import com.assingment.assingment.dao.UserPersonalRepository;
import com.assingment.assingment.dao.UserRepository;
import com.assingment.assingment.entity.UserEntity;
import com.assingment.assingment.entity.UserPersonalEntity;
import com.assingment.assingment.mapper.dto.UserMapper;
import com.assingment.assingment.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
public class UserService {

    private UserRepository userRepository;
    private UserPersonalRepository userPersonalRepository;

    public UserService(UserRepository userRepository, UserPersonalRepository userPersonalRepository){
        this.userRepository = userRepository;
        this.userPersonalRepository = userPersonalRepository;
    }


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

    public List<User> getAllUsers(){
        List<User> all = new ArrayList<>();
        List<UserEntity> allEntity = userRepository.findAllUsers();
        UserMapper userMapper = new UserMapper();
        if(allEntity != null){
            for (UserEntity a: allEntity) {
                UserPersonalEntity userPersonalEntity = userPersonalRepository.findByUserId(a.getUserId());
                if(userPersonalEntity != null)
                all.add(userMapper.mapUser(a, userPersonalEntity));
            }
        }
        return all;
    }
}
