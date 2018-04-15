package com.rp.system.entity;

public class LoginEntity {

	private int id;
	private int userid;
	private String username;
	private String email;
	private String userpwd;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getUserid() {
		return userid;
	}

	public void setUserid(int userid) {
		this.userid = userid;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getUserpwd() {
		return userpwd;
	}

	public void setUserpwd(String userpwd) {
		this.userpwd = userpwd;
	}

	@Override
	public String toString() {
		return "LoginEntity [id=" + id + ", userid=" + userid + ", username=" + username + ", email=" + email
				+ ", userpwd=" + userpwd + "]";
	}

}
