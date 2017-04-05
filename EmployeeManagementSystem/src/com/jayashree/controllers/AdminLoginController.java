package com.jayashree.controllers;

/*
 * @Author: Jayashree Das
 * Designation: Software Engineer
 * Qualification: B.Tech in CSE from NIT Agartala
 * Experience: 2.11 years experience in IT industry 
 */

import com.jayashree.service.*;
import com.jayashree.dao.*;
import com.jayashree.model.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;


@Controller
@RequestMapping("/test")
public class AdminLoginController {
	@Autowired
	AdminLoginService adminloginservice;
	@RequestMapping(value="/submitLogin.html", method=RequestMethod.POST)
	public ModelAndView submitLoginForm(@RequestParam(value="uName") String name,@RequestParam(value="uPass") String pass) {
		System.out.println("Hello Jaya");
		ModelAndView model=null;
		boolean userExists=adminloginservice.checkadminlogin(name, pass);
		System.out.println("User Exists= "+userExists);
		if(userExists) {
			model=new ModelAndView("welcome");
			model.addObject("msg","Hello "+name+" to the world of Scientist");
		}	
		return model;		
	}
}
