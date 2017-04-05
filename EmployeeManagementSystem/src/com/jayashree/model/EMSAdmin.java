package com.jayashree.model;

/*
 * @Author: Jayashree Das
 * Designation: Software Engineer
 * Qualification: B.Tech in CSE from NIT Agartala
 * Experience: 2.11 years experience in IT industry 
 */
import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="ems_admin")
@SuppressWarnings("serial")
public class EMSAdmin implements Serializable{
	
	@Id
	@GeneratedValue
	@Column(name="id", length=11)
	private int id;
	@Column(name="admin_name")
	private String adminName;
	@Column(name="admin_password")
	private String adminPassword;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getAdminName() {
		return adminName;
	}
	public void setAdminName(String adminName) {
		this.adminName = adminName;
	}
	public String getAdminPassword() {
		return adminPassword;
	}
	public void setAdminPassword(String adminPassword) {
		this.adminPassword = adminPassword;
	}
	
}
