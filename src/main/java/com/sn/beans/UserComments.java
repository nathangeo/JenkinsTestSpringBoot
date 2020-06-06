package com.sn.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("userComments")//generic stereotype for any spring managed component
@Scope("prototype")
@Entity
@Table(name="U_COMMENTS")
public class UserComments{
	
	
	@Column(name="USERNAME")
	private String userName;
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="postSequence")
	@SequenceGenerator(allocationSize=1, name="postSequence", sequenceName="SQ_POST_PK")
	@Column(name="POST_ID")
	private int postId;
	
	@Column(name="COMMENTT")
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