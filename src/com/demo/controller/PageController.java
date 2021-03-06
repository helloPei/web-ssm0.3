package com.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
/**
 * 控制层
 * @author Administrator
 *
 */
@Controller
@RequestMapping("/")
public class PageController {
	/**
	 * 主页
	 * @return
	 */
	@RequestMapping("doIndexUI")
	public String doIndexUI(){
		return "index";
	}
	/**
	 * 登录页面
	 * @return
	 */
	@RequestMapping("doLoginUI")
	public String doLoginUI(){
		return "login";
	}
	/**
	 * 页面分页
	 * @return
	 */
//	@RequestMapping("doPageUI")
//	public String doPageUI(){
//		return "common/page";
//	}
	/**
	 * 问卷页面
	 * @return
	 */
	@RequestMapping("doPaperUI")
	public String doPagerUI(){
		return "create_paper";
	}
}