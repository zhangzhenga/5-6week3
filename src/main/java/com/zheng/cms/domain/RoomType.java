/**   
 * Copyright © 2020 公司名. All rights reserved.
 * 
 * @Title: RoomDao.java 
 * @Prject: zheng-room
 * @Package: com.zheng.cms.dao 
 * @Description: TODO
 * @author: lenovo   
 * @date: 2020年5月6日 上午8:48:06 
 * @version: V1.0   
 */
package com.zheng.cms.domain;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;

/** 
 * @ClassName: RoomDao 
 * @Description: TODO
 * @author: lenovo
 * @date: 2020年5月6日 上午8:48:06  
 */
public class RoomType implements Serializable{
	private BigInteger id;
	private BigDecimal price;
	private String name;
	/* (non Javadoc) 
	 * @Title: equals
	 * @Description: TODO
	 * @param obj
	 * @return 
	 * @see java.lang.Object#equals(java.lang.Object) 
	 */
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}
	@Override
	public String toString() {
		return "Room [id=" + id + ", price=" + price + ", name=" + name + "]";
	}
	/* (non Javadoc) 
	 * @Title: hashCode
	 * @Description: TODO
	 * @return 
	 * @see java.lang.Object#hashCode() 
	 */
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}
	public BigInteger getId() {
		return id;
	}
	public void setId(BigInteger id) {
		this.id = id;
	}
	public BigDecimal getPrice() {
		return price;
	}
	public void setPrice(BigDecimal price) {
		this.price = price;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public RoomType(BigInteger id, BigDecimal price, String name) {
		super();
		this.id = id;
		this.price = price;
		this.name = name;
	}
	public RoomType() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
