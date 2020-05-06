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
package com.zheng.cms.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.zheng.cms.Service.RoomService;
import com.zheng.cms.domain.Room;
import com.zheng.cms.domain.VOm;

/** 
 * @ClassName: RoomDao 
 * @Description: TODO
 * @author: lenovo
 * @date: 2020年5月6日 上午8:48:06  
 */
@Controller
public class RoomController {
	@Resource
	RoomService roomService;
	@RequestMapping("list")
	public String llist(Model model,@RequestParam(defaultValue="1") Integer pageNum,
			VOm v){
		PageHelper.startPage(pageNum,3);
		List<Room> list = roomService.list(v);
		PageInfo info=new PageInfo(list);
		model.addAttribute("info", info);
		model.addAttribute("v", v);
		model.addAttribute("pageNum", pageNum);
		return "list";
	}
}
