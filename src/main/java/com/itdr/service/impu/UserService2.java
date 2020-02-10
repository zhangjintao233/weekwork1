package com.itdr.service.impu;

import com.itdr.dao.UserDao;
import com.itdr.service.UserService;

public class UserService2 implements UserService {

    private UserDao userDao;

    public UserDao getUserDao() {
        return userDao;
    }

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public String updateMoney(String aname, String bname, int money) {
        // 转账金额不能为0或负数
        if (money == 0 && money < 0) {
            return "钱不能为0与不能小于0";
        }
        // 查询bname这个用户是否存在
        int s = userDao.selectUsers(bname);
        if (s != 1) {
            return "没有该用户";
        }

        // a用户转账成功减少的金额
        int a = userDao.updateMoney(aname,money,0);
        // b用户转账成功增加的金额
        int b = userDao.updateMoney(bname,money,1);
        if (a !=1 || b != 1){
            return "转账失败";
        }
        return "转账成功";
    }
}
