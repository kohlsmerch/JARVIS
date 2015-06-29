package com.build.classes.hibernate;

// Generated Jun 29, 2015 7:26:16 PM by Hibernate Tools 3.4.0.CR1

import java.util.HashSet;
import java.util.Set;

/**
 * JatUsers generated by hbm2java
 */
public class JatUsers implements java.io.Serializable {

	private int userId;
	private String userName;
	private Set<JatUserrole> jatUserroles = new HashSet<JatUserrole>(0);

	public JatUsers() {
	}

	public JatUsers(int userId) {
		this.userId = userId;
	}

	public JatUsers(int userId, String userName, Set<JatUserrole> jatUserroles) {
		this.userId = userId;
		this.userName = userName;
		this.jatUserroles = jatUserroles;
	}

	public int getUserId() {
		return this.userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return this.userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public Set<JatUserrole> getJatUserroles() {
		return this.jatUserroles;
	}

	public void setJatUserroles(Set<JatUserrole> jatUserroles) {
		this.jatUserroles = jatUserroles;
	}

}
