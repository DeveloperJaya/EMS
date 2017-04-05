package com.jayashree.service;

/*
 * @Author: Jayashree Das
 * Designation: Software Engineer
 * Qualification: B.Tech in CSE from NIT Agartala
 * Experience: 2.11 years experience in IT industry 
 */
import com.jayashree.dao.*;
import com.jayashree.model.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.jayashree.dao.*;

@Service
public class AdminLoginServiceImpl implements AdminLoginService{
	
    @Autowired
	 private AdminLoginDAO adminloginDAO;
	   public void setLoginDAO(AdminLoginDAO adminloginDAO) {
             this.adminloginDAO = adminloginDAO;
      }
	@Override
	public boolean checkadminlogin(String uname, String upass) {
		// TODO Auto-generated method stub
		System.out.println("In Service class...Check Login");
		return adminloginDAO.checkadminlogin(uname, upass);
	}

}
