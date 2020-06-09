package com.sn.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.sn.entity.User;
import com.sn.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    UserService userService;

    @RequestMapping(value = "/all", method = RequestMethod.GET)
    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }

    @CrossOrigin
    @RequestMapping(value = "/adduser", method = RequestMethod.POST,
            consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(code = HttpStatus.OK)
    @ResponseBody()
    public User addNewUser(@RequestBody User user) {
        return this.userService.addUser(user);
    }
    
    @RequestMapping(value = "/findbyusername", method = RequestMethod.POST,
    		consumes = MediaType.ALL_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(code = HttpStatus.OK)
    public User findUserByUsername(@RequestBody String username) {
    	return this.userService.findUserByusername(username);
    }
    
    @RequestMapping(value = "/login", method = RequestMethod.POST,
    		consumes = MediaType.APPLICATION_JSON_VALUE, produces =  MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(code = HttpStatus.OK)
    public boolean loginUser(@RequestBody User user) {
    	return this.userService.existsByUsernameAndPassword(user.getUsername(), user.getPassword());
    	
    }
    //other controllers omitted for brevity

}
