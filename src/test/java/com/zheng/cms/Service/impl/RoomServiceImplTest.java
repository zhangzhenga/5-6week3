/**   
 * Copyright © 2020 公司名. All rights reserved.
 * 
 * @Title: RoomServiceImplTest.java 
 * @Prject: zheng-room
 * @Package: com.zheng.cms.Service.impl 
 * @Description: TODO
 * @author: lenovo   
 * @date: 2020年5月6日 上午8:59:52 
 * @version: V1.0   
 */
package com.zheng.cms.Service.impl;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.zheng.cms.Service.RoomService;
import com.zheng.cms.domain.Room;
import com.zheng.cms.domain.RoomType;
import com.zheng.cms.domain.VOm;
import com.zheng.cms.util.DateUtil;
import com.zheng.cms.util.RandomUtil;
import com.zheng.cms.util.StringUtil;

/** 
 * @ClassName: RoomServiceImplTest 
 * @Description: TODO
 * @author: lenovo
 * @date: 2020年5月6日 上午8:59:52  
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath:spring-beans.xml")
public class RoomServiceImplTest {
	/*
	 *  的房间预订批量新增方法 创建100条房间预订并插入到数据库（20分）
		预订日期   模拟从2020年5月1日至今任意随机日期（4分） 
		姓名       调用StringUtil.generateChineseName()创建（4分）
		手机       11位数字（4分）
		房型id    来自房型类型表（4分）
		备注       随机汉字（4分）

	 */
	@Resource
	RoomService roomService;
	@Test
	public void test() throws ParseException {
		SimpleDateFormat s=new SimpleDateFormat("yyyy-MM-dd");
		Date parse = s.parse("2020-5-1");
		for(int i=0;i<100;i++){
			Date randomDate = DateUtil.randomDate(parse, new Date());
			Room room = new Room();
			room.setCreatdate(randomDate);
			String Name = StringUtil.generateChineseName();
			room.setCname(Name);
			String ranm = RandomUtil.randomNumber(11);
			room.setCphone(ranm);
			List<RoomType> list2 = roomService.list2();
			Integer []i1= new Integer[list2.size()];
			int i2=0;
			for (RoomType roomType : list2) {
				i1[i2++]=roomType.getId().intValue();
			}
			room.setC_typeid(i1[RandomUtil.random(0, i1.length-1)]);
			room.setCbei(StringUtil.randomChineseString(RandomUtil.random(1, 9)));
			roomService.insert(room);
			
		}
	}
	@Test
	public void test1(){
		List<Room> list = roomService.list(new VOm());
		for (Room room : list) {
			System.out.println(room);
		}
	}

}
