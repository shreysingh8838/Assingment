package com.assingment.assingment.mapper;

import com.assingment.assingment.entity.User;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class UserRowMapper implements RowMapper<User>{
    @Override
    public User mapRow(ResultSet resultSet, int rowNum) throws SQLException {
        User user = new User();
        user.setUserId(resultSet.getLong("UserId"));
        user.setUserName(resultSet.getString("UserName"));
        user.setPhoneNumber(resultSet.getString("PhoneNumber"));
        user.setEmail(resultSet.getString("Email"));

        // Need to create DAO to remove the not req fields from the api
        user.setCreatedOn(resultSet.getDate("CreatedOn"));
        user.setChangedOn(resultSet.getDate("ChangedOn"));

        return user;
    }
}
