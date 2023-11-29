package com.assingment.assingment.mapper;

import com.assingment.assingment.entity.UserEntity;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class UserRowMapper implements RowMapper<UserEntity>{
    @Override
    public UserEntity mapRow(ResultSet resultSet, int rowNum) throws SQLException {
        UserEntity userEntity = new UserEntity();
        userEntity.setUserId(resultSet.getLong("UserId"));
        userEntity.setUserName(resultSet.getString("UserName"));
        userEntity.setPhoneNumber(resultSet.getString("PhoneNumber"));
        userEntity.setEmail(resultSet.getString("Email"));

        // Need to create DAO to remove the not req fields from the api
        userEntity.setCreatedOn(resultSet.getDate("CreatedOn"));
        userEntity.setChangedOn(resultSet.getDate("ChangedOn"));

        return userEntity;
    }
}
