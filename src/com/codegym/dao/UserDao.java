package com.codegym.dao;
import com.codegym.model.Login;
import com.codegym.model.User;

import java.util.ArrayList;
import java.util.List;

public class UserDao {
    private static List<User> users;
    static {
        users = new ArrayList<>();
        users.add (new User("Jonh","123456","jonh","jonh@gmail.com",15));
        users.add (new User("duc","123456","duc","duc@gmail.com",15));
        users.add (new User("Quan","123456","quan","quan@gmail.com",15));
        users.add (new User("Hanh","123456","hanh","Hanh@gmail.com",15));
        users.add (new User("Nhu Anh","123456","hu anh","nhuanh@gmail.com",15));
        users.add (new User("Hieu","123456","hieu","hieu@gmail.com",15));
        users.add ( new User("Hello","12","heu","mail",15));
    }
    public  static User checkLogin(Login login){
        for (User u:users){
            if(u.getAccount().equals(login.getAccount())
                    && u.getPassword().equals(login.getPassword())){
                return u;
            }
        }
        return null;
    }
}
