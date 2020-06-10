package com.sn.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sn.entity.Likes;

@Repository
public interface LikesDAO extends JpaRepository<Likes, Integer>{

}
