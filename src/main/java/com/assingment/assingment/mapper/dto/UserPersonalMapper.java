package com.assingment.assingment.mapper.dto;

import com.assingment.assingment.entity.UserPersonalEntity;
import com.assingment.assingment.model.UserPersonal;

public class UserPersonalMapper {
    public UserPersonal mapUserPersonal(UserPersonalEntity userPersonalEntity){
        UserPersonal userPersonal = new UserPersonal();
        userPersonal.setFirstName(userPersonalEntity.getFirstName());
        userPersonal.setMiddleName(userPersonalEntity.getMiddleName());
        userPersonal.setLastName(userPersonalEntity.getLastName());
        userPersonal.setFullName(userPersonalEntity.getFullName());
        userPersonal.setDOB(userPersonalEntity.getDob());
        userPersonal.setGender(userPersonalEntity.getGender());
        userPersonal.setAadharNo(Integer.parseInt(userPersonalEntity.getAadharId()));
        return userPersonal;
    }
}
