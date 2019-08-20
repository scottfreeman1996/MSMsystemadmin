package com.systemadmin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@CrossOrigin(origins = "https://svcsystemadmins.azurewebsites.net")
public class SystemAdminController {
	
	@RequestMapping("/hello")
	@ResponseBody
	public String home(){
		return "hello world";
	}
}
