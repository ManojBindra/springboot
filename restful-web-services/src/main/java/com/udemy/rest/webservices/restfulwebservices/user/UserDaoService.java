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

    public User addUser(User user){
        user.setId(++this.userCount);
        usersList.add(user);
        return usersList.get(userCount -1);
    }

    public User getUserById(int id){
        for(User user : usersList){
            if(user.getId() == id)
                return user;
        }
        return null;
    }

}
