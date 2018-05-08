package com.rp.common.constant;

/**
 * 房源状态枚举
 * 
 * @author 高洪滨
 *
 */
public enum HouseStatus {
	/**
	 * 待约看
	 */
	a("待约看"),
	/**
	 * 已约看
	 */
	b("已约看"),
	/**
	 * 待签约
	 */
	c("待签约"),
	/**
	 * 已签约
	 */
	d("已签约");

	private String status;

	private HouseStatus(String status) {
		this.status = status;
	}

	public String getStatusS() {
		return this.status;
	}
}
