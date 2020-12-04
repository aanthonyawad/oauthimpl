package com.awad.anthony.security.entities;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity(name="user")
public class User {
	

	@Id
	@GeneratedValue
	@Column(name="id")
    private Long id;
	

	@Column(name="username")
	private String username;
	
	@Column(name="password")
	private String password;
	
	@OneToMany(fetch=FetchType.EAGER,cascade=CascadeType.ALL)
	@Column(name="role_id")
	private List<Role> roles;
	
	
	public User() {}


	public User(Long id, String user, String password, List<Role> roles) {
		super();
		this.id = id;
		this.username = user;
		this.password = password;
		this.roles = roles;
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


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


	public List<Role> getRoles() {
		return roles;
	}


	public void setRoles(List<Role> roles) {
		this.roles = roles;
	}
	
	


}
