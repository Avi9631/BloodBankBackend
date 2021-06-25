package com.example.jwt;

import javax.persistence.*;

import lombok.Data;

@Entity
@Data
@Table(name="users")
public class UserModel {
	
	@Id
	private String id;
	private String name;
	private String group;
	private String city;
	private String state;
	private String email;
	private String password;
	private String mobile;
	private String userrole;
	
	public UserModel() {
		// TODO Auto-generated constructor stub
	}

	public UserModel(String id, String name, String group, String city, String state, String email, String password,
			String mobile, String userrole) {
		super();
		this.id = id;
		this.name = name;
		this.group = group;
		this.city = city;
		this.state = state;
		this.email = email;
		this.password = password;
		this.mobile = mobile;
		this.userrole = userrole;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGroup() {
		return group;
	}

	public void setGroup(String group) {
		this.group = group;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getUserrole() {
		return userrole;
	}

	public void setUserrole(String userrole) {
		this.userrole = userrole;
	}

	
	
	
}
