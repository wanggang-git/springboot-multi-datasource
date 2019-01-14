package com.itguang.springbootmultidatasource.repository.test1;

import com.itguang.springbootmultidatasource.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author wanggang.io
 * @create 2018-12-07 15:22
 **/
public interface UserRepository extends JpaRepository<User,Long> {
    User findByUserName(String userName);
    User findByUserNameOrEmail(String username, String email);
}
