package com.text.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LoginController {

	@RequestMapping("/user/")
	public ModelAndView defaultHome() {
		return new ModelAndView("login");
	}

	@RequestMapping("/user/login")
	public ModelAndView login() {
		return new ModelAndView("login");
	}

	@RequestMapping("/user/dashboard")
	public ModelAndView userDashboard() {
		return new ModelAndView("dashboard");
	}

	@RequestMapping("/user/accessdenied")
	public ModelAndView userAccessError() {
		return new ModelAndView("accessdenied");
	}
	
	@RequestMapping("/admin/")
	public ModelAndView admin() {
		return new ModelAndView("admin/login");
	}

	@RequestMapping("/admin/login")
	public ModelAndView adminlogin() {
		return new ModelAndView("admin/login");
	}

	@RequestMapping("/admin/dashboard")
	public ModelAndView admindashboard() {
		return new ModelAndView("admin/dashboard");
	}

	@RequestMapping("/admin/accessdenied")
	public ModelAndView adminAccessError() {
		return new ModelAndView("admin/accessdenied");
	}
	
	@RequestMapping("/manager/")
	public ModelAndView manager() {
		return new ModelAndView("manager/login");
	}

	@RequestMapping("/manager/login")
	public ModelAndView managerlogin() {
		return new ModelAndView("manager/login");
	}

	@RequestMapping("/manager/dashboard")
	public ModelAndView managerdashboard() {
		return new ModelAndView("manager/dashboard");
	}

	@RequestMapping("/manager/accessdenied")
	public ModelAndView managerAccessError() {
		return new ModelAndView("manager/accessdenied");
	}
}
