package com.assingment.assingment.dao;

import com.assingment.assingment.entity.UserPersonal;
import com.assingment.assingment.mapper.UserPersonalRowMapper;
import com.assingment.assingment.mapper.UserRowMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class UserPersonalRepositoryImpl implements UserPersonalRepository{

    @Autowired
    JdbcTemplate jdbcTemplate;

    @Override
    public UserPersonal findByUserId(Long id){
        String userid = id.toString();
        final String sql = "select * from UserPersonal where UserId = ?";
        return this.jdbcTemplate.query(sql.replace("?", userid), new UserPersonalRowMapper()).get(0);
    }

}
