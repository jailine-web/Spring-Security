package com.devsuperior.demo.projections;

public interface UserDetailsProjection {

	String getUsername();
	String getPassword();
	Long getRole();
	String getAuthority();
}
