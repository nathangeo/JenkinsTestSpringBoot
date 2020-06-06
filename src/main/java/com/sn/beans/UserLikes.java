package com.sn.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("userLikes")//generic stereotype for any spring managed component
@Scope("prototype")
@Entity
@Table(name="USER_LIKES")
public class UserLikes {
	
	@Id
	@Column(name="USERNAME")
	private String username;
	
	@Column(name="POST_ID")
	private int post_id;
	public UserLikes() {
		super();
		// TODO Auto-generated constructor stub
	}
	public UserLikes(String username, int post_id) {
		super();
		this.username = username;
		this.post_id = post_id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public int getPost_id() {
		return post_id;
	}
	public void setPost_id(int post_id) {
		this.post_id = post_id;
	}
	@Override
	public String toString() {
		return "UserLikes [username=" + username + ", post_id=" + post_id + "]";
	}
	
	
	
}