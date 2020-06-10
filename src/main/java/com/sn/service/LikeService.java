package com.sn.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sn.dao.LikesDAO;
import com.sn.entity.Likes;

@Service
public class LikeService {
	
	@Autowired
	LikesDAO likesdao;
	
	public Likes addLike(Likes l) {
		return this.likesdao.save(l);
	}
	
    public List<Likes> getAllLikes() {
        return this.likesdao.findAll();
    }

}
