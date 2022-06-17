package com.udemy.rest.webservices.restfulwebservices.user;


import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

@RestController
public class UserController {
    @Autowired
    UserDaoService userDao;

    @GetMapping("/users")
    @SuppressWarnings("all")
    public ResponseEntity<List<User>>  getUsers(){
        return ResponseEntity.ok(userDao.getAllUser());
    }

    @GetMapping("/users/{id}")
    public User getUserById(@PathVariable int id){
        User user = userDao.getUserById(id);
        if(user == null)
            throw new UserNotFoundException("id = " + id + " resorce not found");
        return user;
    }

    @PostMapping("/users")
    public ResponseEntity<User> addUser(@RequestBody User user){
        User userAdded = userDao.addUser(user);
        URI location = ServletUriComponentsBuilder
                        .fromCurrentRequest()
                        .path("/{id}")
                        .buildAndExpand(user.getId())
                        .toUri();
        
       return ResponseEntity.created(location).body(userAdded);
        
    }
                        

}
