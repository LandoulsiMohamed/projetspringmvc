package com.sipacademy.stockmanager.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/dashboard")
public class DashboardController {
	
@RequestMapping("/superadmin")
public String DashboardSuperAdmin(){
	return "dashboard/dashboard_SuperAdmin";
}

@RequestMapping("/admin")
public String DashboardAdmin(){
	return "dashboard/dashboard_Admin";
}

@RequestMapping("/agent")
public String DashboardAgent(){
	return "dashboard/dashboard_Agent";
}
}
