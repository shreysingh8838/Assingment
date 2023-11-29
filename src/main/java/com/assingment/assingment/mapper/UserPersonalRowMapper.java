package com.assingment.assingment.mapper;

import com.assingment.assingment.entity.UserPersonalEntity;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UserPersonalRowMapper implements RowMapper<UserPersonalEntity> {

    @Override
    public UserPersonalEntity mapRow(ResultSet resultSet, int rowNum) throws SQLException {
        UserPersonalEntity userPersonalEntity = new UserPersonalEntity();

        // Need to create DAO to remove the not req fields from the api
        userPersonalEntity.setUserPersonalId(resultSet.getLong("UserPersonalId"));
        userPersonalEntity.setUserId(resultSet.getLong("UserId"));


        userPersonalEntity.setFirstName(resultSet.getString("FirstName"));
        userPersonalEntity.setMiddleName(resultSet.getString("MiddleName"));
        userPersonalEntity.setLastName(resultSet.getString("LastName"));
        userPersonalEntity.setFullName(resultSet.getString("FullName"));
        userPersonalEntity.setDob(resultSet.getDate("DOB"));
        userPersonalEntity.setGender(resultSet.getString("Gender"));
        userPersonalEntity.setAadharId(resultSet.getString("AadharId"));

        return userPersonalEntity;
    }
}
