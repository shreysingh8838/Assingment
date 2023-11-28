package com.assingment.assingment.dao;

import com.assingment.assingment.entity.User;
import com.assingment.assingment.exception.IdNotExistException;
import com.assingment.assingment.mapper.UserRowMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class UserRepositoryImpl implements UserRepository{

    @Autowired
    JdbcTemplate jdbcTemplate;
    @Override
    public User findByUserId(Long id){
        String userid = id.toString();
        final String sql = "select * from User where UserId = ?";
            try{
                return this.jdbcTemplate.query(sql.replace("?", userid), new UserRowMapper()).get(0);
            }
            catch (Exception e){
                throw new IdNotExistException("Id does not exist in the DB" + userid);
            }
    }
}
