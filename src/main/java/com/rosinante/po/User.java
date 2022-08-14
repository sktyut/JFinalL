package com.rosinante.po;

import com.jfinal.ext.plugin.tablebind.TableBind;
import com.jfinal.plugin.activerecord.Model;

import java.util.List;

/**
 * @author rosinante
 * @version 1.0.0
 * @date 2022-08-11- 10:35:34
 * @packageName com.rosinante.po
 * @className User
 * @describe User pojo类
 */
@TableBind(tableName = "user", pkName = "id")
public class User extends Model<User> {
    public static final User dao = new User();

    /*查找用户，用于登录*/
    public List<User> findByNameAndPwd(String username, String password){
        return find("select * from user where username='" + username + "' and password='" + password+ "'");
    }



    /*实现保存数据到数据库的功能*/
    public void saveUser(String username, String password, Integer gender) {
        new User().set("username", username).set("password", password).set("gender", gender).save();
    }

}
