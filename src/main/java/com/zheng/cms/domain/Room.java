/**   
 * Copyright © 2020 公司名. All rights reserved.
 * 
 * @Title: Room_Type.java 
 * @Prject: zheng-room
 * @Package: com.zheng.cms.domain 
 * @Description: TODO
 * @author: lenovo   
 * @date: 2020年5月6日 上午8:50:11 
 * @version: V1.0   
 */
package com.zheng.cms.domain;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;

/** 
 * @ClassName: Room_Type 
 * @Description: TODO
 * @author: lenovo
 * @date: 2020年5月6日 上午8:50:11  
 */
public class Room {
	private Date creatdate;
	private BigDecimal cprice;
	private String cname;
	private String cphone;
	private Integer c_typeid;
	private String cbei;
	private String name;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCbei() {
		return cbei;
	}
	public void setCbei(String cbei) {
		this.cbei = cbei;
	}
	public Date getCreatdate() {
		return creatdate;
	}
	public void setCreatdate(Date creatdate) {
		this.creatdate = creatdate;
	}
	public BigDecimal getCprice() {
		return cprice;
	}
	public void setCprice(BigDecimal cprice) {
		this.cprice = cprice;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public String getCphone() {
		return cphone;
	}
	public void setCphone(String cphone) {
		this.cphone = cphone;
	}
	public Integer getC_typeid() {
		return c_typeid;
	}
	public void setC_typeid(Integer c_typeid) {
		this.c_typeid = c_typeid;
	}
	public Room(Date creatdate, BigDecimal cprice, String cname, String cphone,
			Integer c_typeid) {
		super();
		this.creatdate = creatdate;
		this.cprice = cprice;
		this.cname = cname;
		this.cphone = cphone;
		this.c_typeid = c_typeid;
	}
	public Room() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		SimpleDateFormat s=new SimpleDateFormat("yyyy-MM-dd");
		return "Room [creatdate=" + s.format(creatdate) + ", cprice=" + cprice
				+ ", cname=" + cname + ", cphone=" + cphone + ", c_typeid="
				+ c_typeid + ", cbei=" + cbei + "]";
	}
	
}
