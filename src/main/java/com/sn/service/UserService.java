package com.sn.service;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
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
     
     public boolean existsByUsernameAndPassword(String username, String password) {
    	 return this.userDao.existsByUsernameAndPassword(username, password);
     }
 
     public User updatePassword(String username, String passwordOld, String passwordNew) {
    	 User u = this.userDao.findUserByUsername(username);
    	 u.setPassword(passwordNew);
    	 this.userDao.save(u);
    	 return u;
     }

     
     public static byte[] getBytesFromFile(File file) throws IOException {        
         // Get the size of the file
         long length = file.length();

         // You cannot create an array using a long type.
         // It needs to be an int type.
         // Before converting to an int type, check
         // to ensure that file is not larger than Integer.MAX_VALUE.
         if (length > Integer.MAX_VALUE) {
             // File is too large
             throw new IOException("File is too large!");
         }

         // Create the byte array to hold the data
         byte[] bytes = new byte[(int)length];

         // Read in the bytes
         int offset = 0;
         int numRead = 0;

         InputStream is = new FileInputStream(file);
         try {
             while (offset < bytes.length
                    && (numRead=is.read(bytes, offset, bytes.length-offset)) >= 0) {
                 offset += numRead;
             }
         } finally {
             is.close();
         }

         // Ensure all the bytes have been read in
         if (offset < bytes.length) {
             throw new IOException("Could not completely read file "+file.getName());
         }
         return bytes;
     }
     
}
