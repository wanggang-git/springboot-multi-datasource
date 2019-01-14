package com.itguang.springbootmultidatasource.repository.test2;

import com.itguang.springbootmultidatasource.domain2.Person;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author wanggang.io
 * @create 2018-12-07 15:22
 **/
public interface personRepository extends JpaRepository<Person,Long>{
    //pserson findByUserName(String userName);
    //pserson findByUserNameOrEmail(String username, String email);
}
