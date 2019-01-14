package com.itguang.springbootmultidatasource.controller;

import com.itguang.springbootmultidatasource.domain.User;
import com.itguang.springbootmultidatasource.domain2.Person;
import com.itguang.springbootmultidatasource.repository.test1.UserInfoRepository;
import com.itguang.springbootmultidatasource.repository.test1.UserRepository;
import com.itguang.springbootmultidatasource.repository.test2.personRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Author: wanggang.io
 * @Date: 2019/1/10 17:44
 * @todo
 */
@RestController
public class UserController {
    @Resource
    private UserRepository userTest1Repository;
    @Resource
    private personRepository personRepository;
    @Resource
    private UserInfoRepository userInfoRepository;
    @GetMapping("getuser")
    public List<User> getAllUser( ){
        return userTest1Repository.findAll() ;
    }

    @GetMapping("getPerson")
    public List<Person> getAllPerson(){
        return personRepository.findAll();
    }

    @GetMapping("getUserInfo")
    public List getUserInfo(){
        return userInfoRepository.findAll();
    }
}
