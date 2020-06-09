package com.sn.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sn.dao.UserDAO;
import com.sn.entity.User;

@Service
 public class UserService {
     @Autowired
     UserDAO userDao;
 
     public List<User> getAllUsers() {
         return this.userDao.findAll();
     }
 
     public User addUser(User user) {
         return this.userDao.save(user);
     }
 
     
     public User findUserByusername(String username) {
    	 return this.userDao.findUserByUsername(username);
     }
     
     //other methods omitted for brevity
 }
