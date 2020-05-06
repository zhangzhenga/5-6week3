/**   
 * Copyright © 2020 公司名. All rights reserved.
 * 
 * @Title: VOm.java 
 * @Prject: zheng-room
 * @Package: com.zheng.cms.domain 
 * @Description: TODO
 * @author: lenovo   
 * @date: 2020年5月6日 上午8:56:51 
 * @version: V1.0   
 */
package com.zheng.cms.domain;

import java.util.Date;

/** 
 * @ClassName: VOm 
 * @Description: TODO
 * @author: lenovo
 * @date: 2020年5月6日 上午8:56:51  
 */
public class VOm {
	private String name;
	private String phone;
	private String type;
	private String price;
	private Integer p1;
	private Integer p2;
	private String d1;
	private String d2;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public Integer getP1() {
		return p1;
	}
	public void setP1(Integer p1) {
		this.p1 = p1;
	}
	public Integer getP2() {
		return p2;
	}
	public void setP2(Integer p2) {
		this.p2 = p2;
	}
	public String getD1() {
		return d1;
	}
	public void setD1(String d1) {
		this.d1 = d1;
	}
	public String getD2() {
		return d2;
	}
	public void setD2(String d2) {
		this.d2 = d2;
	}
	public VOm() {
		super();
		// TODO Auto-generated constructor stub
	}
	public VOm(String name, String phone, String type, String price,
			Integer p1, Integer p2, String d1, String d2) {
		super();
		this.name = name;
		this.phone = phone;
		this.type = type;
		this.price = price;
		this.p1 = p1;
		this.p2 = p2;
		this.d1 = d1;
		this.d2 = d2;
	}
	@Override
	public String toString() {
		return "VOm [name=" + name + ", phone=" + phone + ", type=" + type
				+ ", price=" + price + ", p1=" + p1 + ", p2=" + p2 + ", d1="
				+ d1 + ", d2=" + d2 + "]";
	}
	
	
	
}
