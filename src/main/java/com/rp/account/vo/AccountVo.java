package com.rp.account.vo;

public class AccountVo {
	private String username;
	private String password;
	private Integer role;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Integer getRole() {
		return role;
	}

	public void setRole(Integer role) {
		this.role = role;
	}

	@Override
	public String toString() {
		return "AccountVo [username=" + username + ", password=" + password + ", role=" + role + "]";
	}
}
