package com.itdr.controller;

import com.itdr.service.UserService;
import com.itdr.service.impu.UserService2;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UsersController {

    private UserService2 userService2;


    public String updateMoney(String aname,String bname,int money){
        String users = userService2.updateMoney(aname,bname,money);
        return users;
    }

    public void setUserService2(UserService2 userService2) {
        this.userService2 = userService2;
    }

    public UserService2 getUserService2() {
        return userService2;
    }
}
