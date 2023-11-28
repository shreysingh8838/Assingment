package com.assingment.assingment.mapper;

import com.assingment.assingment.entity.UserPersonal;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UserPersonalRowMapper implements RowMapper<UserPersonal> {

    @Override
    public UserPersonal mapRow(ResultSet resultSet, int rowNum) throws SQLException {
        UserPersonal userPersonal = new UserPersonal();

        // Need to create DAO to remove the not req fields from the api
        userPersonal.setUserPersonalId(resultSet.getLong("UserPersonalId"));
        userPersonal.setUserId(resultSet.getLong("UserId"));


        userPersonal.setFirstName(resultSet.getString("FirstName"));
        userPersonal.setMiddleName(resultSet.getString("MiddleName"));
        userPersonal.setLastName(resultSet.getString("LastName"));
        userPersonal.setFullName(resultSet.getString("FullName"));
        userPersonal.setDob(resultSet.getDate("DOB"));
        userPersonal.setGender(resultSet.getString("Gender"));
        userPersonal.setAadharId(resultSet.getString("AadharId"));

        return userPersonal;
    }
}
