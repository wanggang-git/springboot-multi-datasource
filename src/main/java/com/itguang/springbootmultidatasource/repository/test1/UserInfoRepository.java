package com.itguang.springbootmultidatasource.repository.test1;

import com.itguang.springbootmultidatasource.domain.UserInfo;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @Author: wanggang.io
 * @Date: 2018/12/26 16:51
 * @todo
 */
public interface UserInfoRepository extends JpaRepository<UserInfo,String> {

}
