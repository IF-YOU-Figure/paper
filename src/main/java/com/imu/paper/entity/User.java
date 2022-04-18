package com.imu.paper.entity;


import lombok.Data;
import org.apache.ibatis.type.Alias;

/**
 * @Author: 飞宇
 * @Date: 2019/4/25 15:51
 * @Version 1.0
 */


@Data
@Alias("user")
public class User {

    private String user_id;
    private String user_name;
    private String user_email;
    private String user_phone;
    private String user_address;
    private String user_password;
    private String user_position;
    private String user_qq;
    private String user_age;
    private String user_grade;
    private String user_target;
    private String user_direction;

}
