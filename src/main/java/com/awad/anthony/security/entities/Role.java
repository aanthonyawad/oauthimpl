package com.awad.anthony.security.entities;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity(name="role")
public class Role {
	
	@Id
	@GeneratedValue
	@Column(name="id")
    private Long id;
	

	@Column(name="role")
	private String role;
	
	public Role() {}

	public Role(Long id, String role) {
		super();
		this.id = id;
		this.role = role;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}
	
	
}
