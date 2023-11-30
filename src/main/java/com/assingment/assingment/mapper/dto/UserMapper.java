package com.assingment.assingment.mapper.dto;

import com.assingment.assingment.entity.UserEntity;
import com.assingment.assingment.entity.UserPersonalEntity;
import com.assingment.assingment.model.User;

public class UserMapper {

    public User mapUser(UserEntity userEntity, UserPersonalEntity userPersonalEntity){
        User user = new User();
        UserPersonalMapper userPersonalMapper = new UserPersonalMapper();
        user.setUserName(userEntity.getUserName());
        user.setPhoneNumber(userEntity.getPhoneNumber());
        user.setEmail(userEntity.getEmail());
        user.setUserPersonal(userPersonalMapper.mapUserPersonal(userPersonalEntity));
        return user;
    }
}
