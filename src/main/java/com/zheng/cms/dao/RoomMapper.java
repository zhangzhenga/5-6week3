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
package com.zheng.cms.dao;

import java.util.List;

import com.zheng.cms.domain.Room;
import com.zheng.cms.domain.RoomType;
import com.zheng.cms.domain.VOm;

/** 
 * @ClassName: RoomDao 
 * @Description: TODO
 * @author: lenovo
 * @date: 2020年5月6日 上午8:48:06  
 */
public interface RoomMapper {
	/**
	 * 
	 * @Title: list 
	 * @Description: 房间预订分页条件查询
	 * @param v
	 * @return
	 * @return: List<Room>
	 */
	List<Room>list(VOm v);
	/**
	 * 
	 * @Title: list 
	 * @Description: 房间预订单条新增
	 * @param v
	 * @return
	 * @return: List<Room>
	 */
	Integer insert(Room r);
	/**
	 * 
	 * @Title: insertp 
	 * @Description: 房间预订批量新增
	 * @param r
	 * @return
	 * @return: Integer
	 */
	Integer insertp(Room r);
	/**
	 * 
	 * @Title: list2 
	 * @Description: 房型类型
	 * @return
	 * @return: List<RoomType>
	 */
	List<RoomType>list2();
}
