package com.skillsmap.systemadmin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SystemAdminController {
	
	@RequestMapping("/hello")
	@ResponseBody
	public String home(){
		return "hello world";
	}
}
