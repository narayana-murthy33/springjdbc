package com.springjdbc;
public class Userpasvalid {
	
	private int id;
	private String username;
	private String password;
	private String firstname;
	private String lastname;
	private String gender;
	private String phonenumber;
	private String email;
	public Userpasvalid(int id, String username, String password, String firstname, String lastname, String gender,
			String phonenumber, String email) {
		
		this.id = id;
		this.username = username;
		this.password = password;
		this.firstname = firstname;
		this.lastname = lastname;
		this.gender = gender;
		this.phonenumber = phonenumber;
		this.email = email;
	}
	@Override
	public String toString() {
		return "Userpasvalid [id=" + id + ", username=" + username + ", password=" + password + ", firstname="
				+ firstname + ", lastname=" + lastname + ", gender=" + gender + ", phonenumber=" + phonenumber
				+ ", email=" + email + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
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
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getPhonenumber() {
		return phonenumber;
	}
	public void setPhonenumber(String phonenumber) {
		this.phonenumber = phonenumber;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
public Userpasvalid() {
	
}
}
