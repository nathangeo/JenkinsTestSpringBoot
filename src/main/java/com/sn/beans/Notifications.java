package com.sn.beans;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("notifications")//generic stereotype for any spring managed component
@Scope("prototype")
@Entity
@Table(name="NOTIFICATIONS")
public class Notifications {
	
	@Id
	@Column(name="USERNAME")
	private String username;
	
	@Column(name="TEXT")
	private String text;
	
	public Notifications() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Notifications(String username, String text) {
		super();
		this.username = username;
		this.text = text;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	@Override
	public String toString() {
		return "Notifications [username=" + username + ", text=" + text + "]";
	}
	
	
	
	
}