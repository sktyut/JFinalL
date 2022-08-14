package com.rosinante.controller;

import com.jfinal.core.Controller;
import com.rosinante.po.User;
import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

import java.util.Date;

/**
 * @author rosinante
 * @version 1.0.0
 * @date 2022-08-11- 09:47:57
 * @packageName com.rosinante.controller
 * @className IndexController
 * @describe index页面控制器
 */
public class RegisterController extends Controller {
    public void index(){
        renderFreeMarker("/page/register.ftl");
    }
    public void register(){

        User user = getModel(User.class);
        user.set("createTime", new Date());
        user.set("status", 0);
        boolean save = user.save();
        if(!save){
            System.out.println("存储user失败");
        }else{
            setAttr("username", user.get("username"));
            setAttr("password", user.get("password"));
            setAttr("gender", user.get("gender"));
            setAttr("birthday", user.get("birthday"));
            setAttr("createTime", user.get("createTime"));

            render("/page/OK.ftl");
        }
    }

}
