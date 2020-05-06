/**   
 * Copyright © 2020 公司名. All rights reserved.
 * 
 * @Title: RoomService.java 
 * @Prject: zheng-room
 * @Package: com.zheng.cms.Service 
 * @Description: TODO
 * @author: lenovo   
 * @date: 2020年5月6日 上午8:48:24 
 * @version: V1.0   
 */
package com.zheng.cms.Service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.zheng.cms.Service.RoomService;
import com.zheng.cms.dao.RoomMapper;
import com.zheng.cms.domain.Room;
import com.zheng.cms.domain.RoomType;
import com.zheng.cms.domain.VOm;

/** 
 * @ClassName: RoomService 
 * @Description: TODO
 * @author: lenovo
 * @date: 2020年5月6日 上午8:48:24  
 */
@Service
public class RoomServiceImpl implements RoomService{
	@Resource
	RoomMapper roomMapper;
	/* (non Javadoc) 
	 * @Title: list
	 * @Description: TODO
	 * @param v
	 * @return 
	 * @see com.zheng.cms.Service.RoomService#list(com.zheng.cms.domain.VOm) 
	 */
	@Override
	public List<Room> list(VOm v) {
		// TODO Auto-generated method stub
		return roomMapper.list(v);
	}

	/* (non Javadoc) 
	 * @Title: insert
	 * @Description: TODO
	 * @param r
	 * @return 
	 * @see com.zheng.cms.Service.RoomService#insert(com.zheng.cms.domain.Room) 
	 */
	@Override
	public Integer insert(Room r) {
		// TODO Auto-generated method stub
		return roomMapper.insert(r);
	}

	/* (non Javadoc) 
	 * @Title: insertp
	 * @Description: TODO
	 * @param r
	 * @return 
	 * @see com.zheng.cms.Service.RoomService#insertp(com.zheng.cms.domain.Room) 
	 */
	@Override
	public Integer insertp(Room r) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non Javadoc) 
	 * @Title: list2
	 * @Description: TODO
	 * @return 
	 * @see com.zheng.cms.Service.RoomService#list2() 
	 */
	@Override
	public List<RoomType> list2() {
		// TODO Auto-generated method stub
		return roomMapper.list2();
	}

}
