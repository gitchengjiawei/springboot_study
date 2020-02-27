package com.cjw.pojo;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Date;
import java.util.List;

/**
 * @Description
 * @auther 程佳伟
 * @create 2020-02-25 17:49
 */
@Getter
@Setter
@ToString
public class User {

    private String name;
    private int age;
    private Date birthday;
    private List<User> friends;
}
