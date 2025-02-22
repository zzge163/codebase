﻿package com.sxgis.hibernate.bean.bi_1_1;

import javax.persistence.*;

/**
 * Description: <br/>
 * 网站: <a href="http://www.crazyit.org">疯狂Java联盟</a> <br/>
 * Copyright (C), 2001-2010, Yeeku.H.Lee <br/>
 * This program is protected by copyright laws. <br/>
 * Program Name: <br/>
 * Date:
 * 
 * @author Yeeku.H.Lee kongyeeku@163.com
 * @version 1.0
 */
@Entity
@Table(name = "address")
public class Address {
	// 标识属性
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int addressid;
	
	// 地址详细信息
	private String detail;
	
	// 保留关联实体的person属性
	@OneToOne(optional = false, cascade = CascadeType.ALL, fetch = FetchType.EAGER, targetEntity = Person.class)
	/* @JoinColumn用于映射外键列 */
	@JoinColumn(name = "person_id", nullable = false, updatable = false)
	private Person person;

	// 无参数的构造器
	public Address() {
	}

	// 初始化detail属性的构造器
	public Address(String detail) {
		this.detail = detail;
	}

	// addressid属性的setter和getter方法
	public void setAddressid(int addressid) {
		this.addressid = addressid;
	}

	public int getAddressid() {
		return this.addressid;
	}

	// detail属性的setter和getter方法
	public void setDetail(String detail) {
		this.detail = detail;
	}

	public String getDetail() {
		return this.detail;
	}

	// person属性的setter和getter方法
	public void setPerson(Person person) {
		this.person = person;
	}

	public Person getPerson() {
		return this.person;
	}
}