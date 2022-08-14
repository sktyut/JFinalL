package com.rosinante.config;

import com.jfinal.config.*;
import com.jfinal.plugin.activerecord.ActiveRecordPlugin;
import com.jfinal.plugin.druid.DruidPlugin;
import com.jfinal.render.ViewType;
import com.rosinante.controller.IndexController;
import com.rosinante.controller.RegisterController;
import com.rosinante.po.User;

/**
 * @author rosinante
 * @version 1.0.0
 * @date 2022-08-11- 09:41:32
 * @packageName com.rosinante.config
 * @className AppConfig
 * @describe JFinal 配置文件
 */
public class AppConfig extends JFinalConfig {

    public void configConstant(Constants constants) {
        constants.setDevMode(true);
        constants.setViewType(ViewType.FREE_MARKER);
        constants.setEncoding("UTF-8");
        constants.setFreeMarkerViewExtension("ftl");
    }

    public void configRoute(Routes routes) {
        routes.add("/", IndexController.class);
        routes.add("/register", RegisterController.class);
    }

    public void configPlugin(Plugins plugins) {
        DruidPlugin dp = new DruidPlugin("jdbc:mysql://localhost:3306/test?serverTimezone=UTC&useUnicode=true&characterEncoding=utf8","root", "123456","com.mysql.cj.jdbc.Driver");
        plugins.add(dp);
        ActiveRecordPlugin arp = new ActiveRecordPlugin(dp);
        arp.addMapping("user", User.class);
        arp.setShowSql(true);
        plugins.add(arp);
    }

    public void configInterceptor(Interceptors interceptors) {

    }

    public void configHandler(Handlers handlers) {

    }
}
