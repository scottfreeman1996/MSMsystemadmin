package com.systemadmin.webservices;

import javax.ws.rs.ext.Provider;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.stereotype.Component;

import com.systemadmin.controller.SystemAdminController;

@Provider
@Component
public class ServiceConfig extends ResourceConfig {
	
	public ServiceConfig() {
		register(CORSFilter.class);
		register(SystemAdminController.class);
	}
}
