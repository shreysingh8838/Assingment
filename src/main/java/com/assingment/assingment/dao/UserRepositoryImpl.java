package com.assingment.assingment.dao;

import com.assingment.assingment.entity.UserEntity;
import com.assingment.assingment.mapper.UserRowMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserRepositoryImpl implements UserRepository{

    @Autowired
    JdbcTemplate jdbcTemplate;
    @Override
    public UserEntity findByUserId(Long id){
        String userid = id.toString();
        final String sql = "select * from User where UserId = ?";
            try{
                return this.jdbcTemplate.query(sql.replace("?", userid), new UserRowMapper()).get(0);
            }
            catch (Exception e){
                return null;
            }
    }

    @Override
    public List<UserEntity> findAllUsers(){
        final String  sql = "Select * from User";
        try{
            return jdbcTemplate.query(sql, new UserRowMapper());
        }
        catch (Exception e){
            System.out.println(e);
            return null;
        }
    }
}
