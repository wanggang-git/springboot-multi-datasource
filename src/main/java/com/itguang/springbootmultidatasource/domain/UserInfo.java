package com.itguang.springbootmultidatasource.domain;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @Author: wanggang.io
 * @Date: 2018/12/26 16:47
 * @todo
 */
@Entity
@Data
@Table(name = "view")
public class UserInfo {
    @Id
    @Column(name="email")
    String email;
    @Column(name="nick_name")
    String nickName;

    public UserInfo() {
    }

}
