package com.codegym.user.dao;

import com.codegym.user.model.Login;
import com.codegym.user.model.User;

import java.util.ArrayList;
import java.util.List;

public class UserDao {
    private static List<User> users;
    static {
        users = new ArrayList<>();
        User u1 = new User();
        u1.setAge(10);
        u1.setName("John");
        u1.setAccount("john");
        u1.setEmail("john@codegym.vn");
        u1.setPassword("123");
        users.add(u1);

        User u2 = new User();
        u2.setAge(15);
        u2.setName("Bill");
        u2.setAccount("bill");
        u2.setEmail("bill@codegym.vn");
        u2.setPassword("1234");
        users.add(u2);


    }

    public static User checkLogin(Login login){
        for (User u:users){
            if (u.getAccount().equals(login.getAccount())&&u.getPassword().equals(login.getPassword())){
                return u;
            }
        }
        return null;
    }

}
