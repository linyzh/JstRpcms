package com.benliu.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class IndexController {

	/**
	 * 返回首页接口
	 * @return
	 */
	@RequestMapping(value = {"/", "/index", "/home"})
	public ModelAndView index() {
		return new ModelAndView("index");
	}
	
}
