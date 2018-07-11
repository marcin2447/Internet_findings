package pl.home.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;

import javax.persistence.Id;


@Entity
public class User {
	
	
	
	@Id
	@GeneratedValue
	private long id;
	private String username;
	private String email;
	private String password;
	private boolean active;
	
	public User() { }
	
	public User(User user) {
		this.id = user.id;
		this.username = user.username;
		this.email = user.email;
		this.password = user.password;
	}
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
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
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}
}