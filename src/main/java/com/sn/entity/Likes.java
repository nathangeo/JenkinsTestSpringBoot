package com.sn.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "LIKES_TABLE")
public class Likes {

    @Column(name = "ID")
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "LIKES_PK_SEQ")
    private Integer id;
    
    @Column(name = "POST_ID")
    private Integer pId;
	
	@Column(name = "COMMENT_ID")
	private Integer cId;

	public Likes() {
		super();
	}

	
	
	public Likes(Integer pId) {
		super();
		this.pId = pId;
	}



	public Likes(Integer pId, Integer cId) {
		super();
		this.pId = pId;
		this.cId = cId;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getpId() {
		return pId;
	}

	public void setpId(Integer pId) {
		this.pId = pId;
	}

	public Integer getcId() {
		return cId;
	}

	public void setcId(Integer cId) {
		this.cId = cId;
	}

	@Override
	public String toString() {
		return "Likes [id=" + id + ", pId=" + pId + ", cId=" + cId + "]";
	}
	
	
}
