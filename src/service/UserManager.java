package service;

import model.User;

public class UserManager {

    public void add(){

    }

    public void delete (){

    }

    public void update(){

    }

    public void login(User user){
        System.out.println(user.getName() +"kullanicisi login oldu");
    }

    public void logout(User user){
        System.out.println(user.getName() +"kullanicisi logout oldu");
    }
}
