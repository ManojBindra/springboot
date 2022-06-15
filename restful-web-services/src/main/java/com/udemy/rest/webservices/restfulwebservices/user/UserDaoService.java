package com.udemy.rest.webservices.restfulwebservices.user;

import java.util.List;
import java.util.ArrayList;
import org.springframework.stereotype.Repository;

@Repository
public class UserDaoService {
    private List<User> usersList;
    private int userCount;

    UserDaoService(){
        this.usersList = new ArrayList<>();
        this.userCount = 0;
    }

    public List<User> getAllUser(){
        return usersList;
    }

    public void addUser(User user){
        user.setId(++this.userCount);
        usersList.add(user);
    }

}
