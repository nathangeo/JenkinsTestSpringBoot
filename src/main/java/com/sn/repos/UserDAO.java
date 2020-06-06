package com.sn.repos;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sn.beans.User;

public interface UserDAO extends JpaRepository<User, String>{
	public List<User> findUserByUsername(String username);
}
