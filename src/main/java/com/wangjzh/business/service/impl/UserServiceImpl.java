package com.wangjzh.business.service.impl;

import com.wangjzh.business.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    @Qualifier("secondaryJdbcTemplate")
    private JdbcTemplate jdbcTemplate;

    @Override
    public void create(String name, Integer age){
        jdbcTemplate.update("insert into user (NAME,AGE) VALUES (?,?)",name,age);
    }

    @Override
    public void deleteByName(String name) {
        jdbcTemplate.update("DELETE FROM user WHERE NAME = ?",name);
    }

    @Override
    public Integer getAllUsers() {
        return jdbcTemplate.queryForObject("SELECT COUNT(1) FROM user",Integer.class);
    }

    @Override
    public void deleteAllUsers() {
        jdbcTemplate.update("DELETE FROM user");
    }
}
