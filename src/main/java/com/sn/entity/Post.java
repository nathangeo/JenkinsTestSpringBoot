package com.sn.entity;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrePersist;
import javax.persistence.Table;


@Entity
@Table(name="POST_TABLE")
public class Post {

	
    @Column(name = "ID")
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "POST_PK_SEQ")
    private Integer id;
  
    @Column(name = "USERNAME")
    private String username;
    
    @Column(name = "POST_BODY")
    private String post;
    
    @Column(name = "POST_IMAGE")
    private String image;
    
    
    @Column(name = "POST_TIME")
    private String date;
    
    @PrePersist
    protected void prePersist() {
        if (this.date == null) {
        	DateFormat df = new SimpleDateFormat("dd/MM/yy HH:mm:ss");
        	date = df.format(Calendar.getInstance().getTime());
        }
    }

    
	public Post() {
		super();
	}

	public Post(Integer id) {
		super();
		this.id = id;
	}

	public Post(String username) {
		super();
		this.username = username;
	}

	public Post(Integer id, String username) {
		super();
		this.id = id;
		this.username = username;
	}

	
	
	public Post(String username, String post, String image) {
		super();
		this.username = username;
		this.post = post;
		this.image = image;
	}

	public Post(String username, String post) {
		super();
		this.username = username;
		this.post = post;
	}

	public Post(Integer id, String username, String post, String image) {
		super();
		this.id = id;
		this.username = username;
		this.post = post;
		this.image = image;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPost() {
		return post;
	}

	public void setPost(String post) {
		this.post = post;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}


	public String getDate() {
		return date;
	}


	public void setDate(String date) {
		this.date = date;
	}


	@Override
	public String toString() {
		return "Post [id=" + id + ", username=" + username + ", post=" + post + ", image=" + image + ", date=" + date
				+ "]";
	}


	

	
	

    
    
	
}
