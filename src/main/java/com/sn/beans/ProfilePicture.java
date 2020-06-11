package com.sn.beans;

import java.io.File;

public class ProfilePicture {

	private String username;
	private File picture;
	public ProfilePicture(String username, File picture) {
		super();
		this.username = username;
		this.picture = picture;
	}
	public ProfilePicture() {
		super();
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public File getPicture() {
		return picture;
	}
	public void setPicture(File picture) {
		this.picture = picture;
	}
	@Override
	public String toString() {
		return "ProfilePicture [username=" + username + ", picture=" + picture + "]";
	}
	
	
}
