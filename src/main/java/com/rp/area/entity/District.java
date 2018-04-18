package com.rp.area.entity;

public class District {

	private Integer id;
	private String name;
	private Integer cityId;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getCityId() {
		return cityId;
	}

	public void setCityId(Integer cityId) {
		this.cityId = cityId;
	}

	@Override
	public String toString() {
		return "District [id=" + id + ", name=" + name + ", cityId=" + cityId + "]";
	}
}
