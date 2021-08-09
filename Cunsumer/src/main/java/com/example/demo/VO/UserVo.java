package com.example.demo.VO;

import java.util.Date;

public class UserVo {

	
	private Long id;
	private String firstName;
	private String lastName;
	private String userName;
	private String password;
	private String otp;
	private Long roleId;
	private String phone;
	private Boolean isVrified;
	private Boolean status;
	private Date createdAt;
	private String photo;
	
	public UserVo() {
		super();
	}

	public UserVo(Long id, String firstName, String lastName, String userName, String password, String otp, Long roleId,
			String phone, Boolean isVrified, Boolean status, Date createdAt, String photo) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.userName = userName;
		this.password = password;
		this.otp = otp;
		this.roleId = roleId;
		this.phone = phone;
		this.isVrified = isVrified;
		this.status = status;
		this.createdAt = createdAt;
		this.photo = photo;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getOtp() {
		return otp;
	}

	public void setOtp(String otp) {
		this.otp = otp;
	}

	public Long getRoleId() {
		return roleId;
	}

	public void setRoleId(Long roleId) {
		this.roleId = roleId;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public Boolean getIsVrified() {
		return isVrified;
	}

	public void setIsVrified(Boolean isVrified) {
		this.isVrified = isVrified;
	}

	public Boolean getStatus() {
		return status;
	}

	public void setStatus(Boolean status) {
		this.status = status;
	}

	public Date getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	public String getPhoto() {
		return photo;
	}

	public void setPhoto(String photo) {
		this.photo = photo;
	}
	
	
	
}
