package com.sn.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("UserComments")//generic stereotype for any spring managed component
@Scope("prototype")
@Entity
@Table(name="USER_COMMENTS")
public class UserComments{
	
	@Id
	@Column(name="USERNAME")
	private String userName;
	
	@Column(name="POST_ID")
	private int postId;
	
	@Column(name="COMMENT")
	private String comment;
	public UserComments() {
		super();
		// TODO Auto-generated constructor stub
	}
	public UserComments(String userName, int postId, String comment) {
		super();
		this.userName = userName;
		this.postId = postId;
		this.comment = comment;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public int getPostId() {
		return postId;
	}
	public void setPostId(int postId) {
		this.postId = postId;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	@Override
	public String toString() {
		return "UserComments [userName=" + userName + ", postId=" + postId + ", comment=" + comment + "]";
	}
	
	
}