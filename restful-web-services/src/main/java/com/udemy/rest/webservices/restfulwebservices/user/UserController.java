package com.udemy.rest.webservices.restfulwebservices.user;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Autowired
    UserDaoService userDao;

    @GetMapping("/users")
    public List<User> getUsers(){
        return userDao.getAllUser();
    }

    @PostMapping("/user")
    public void addUser(@RequestBody User user){
        userDao.addUser(user);
    }

}
