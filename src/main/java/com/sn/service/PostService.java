package com.sn.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sn.dao.PostDAO;
import com.sn.entity.Post;

@Service
public class PostService {

	@Autowired
	PostDAO postdao;
	
	public Post addPost(Post p) {
		return this.postdao.save(p);
	}
	
	
}
