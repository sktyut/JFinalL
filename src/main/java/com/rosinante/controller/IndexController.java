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
        renderText("Hello JFinal World，你好");
    }
}
