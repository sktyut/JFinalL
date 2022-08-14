package com.rosinante.controller;

import com.jfinal.core.Controller;

/**
 * @author rosinante
 * @version 1.0.0
 * @date 2022-08-11- 09:47:57
 * @packageName com.rosinante.controller
 * @className IndexController
 * @describe index页面控制器
 */
public class IndexController extends Controller {
    public void index(){
        // get提交 ?key1=value1&key2=value2
        // 如果找不到action 比如 url请求为 localhost:8080/JFinalL/test
        // index controller下没有名为test的方法 也即action
        // 此时jfinal会将 / 后面的 test 认作一个参数，去向index action传参
        String value1 = getPara("key1");

        renderText("Hello JFinal World，你好");
    }

    public void download(){
        renderFile("test.sql");
    }

    public void test(){
        // 渲染的路径 如果以 / 开头 则自动去webapp根目录下去找 如果不以 / 开头 则自动去config配置的路径去找
        render("test.html");
    }
}
