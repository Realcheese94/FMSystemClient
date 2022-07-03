package com.practice.demo.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class AdminMember {

	@Id
	@GeneratedValue(strategy =  GenerationType.AUTO)
	private Long id;
	@Column
	private String adminId;
	@Column
	private String adminPw;
}
