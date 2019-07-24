package com.skillsmap.systemadmin.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@SpringBootApplication
public class SystemAdminApplication extends SpringBootServletInitializer {

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(SystemAdminApplication.class);
	}
	
	public static void main(String[] args) throws Exception {
		ConfigurableApplicationContext ctx = 
		SpringApplication.run(SystemAdminApplication.class, args);
	}
	
	@Controller
	class WebController {
		
		@RequestMapping("/")
		@ResponseBody
		public String home(){
			return "hello world";
		}
	}
	
	

}
