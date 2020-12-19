package com.admin.ecommerce.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Users {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int userId;
	@Column
	private String userType;
	@Column
	private String userName;
	@Column
	private String userPassword;
	@Column
	private String userEmail;
	@Column
	private String userMobile;
	@Column
	private String userAddress;
	@Column
	private String userPincode;
	@Column
	private String userAddedOn;
	public Users() {
		super();
	}
	public Users(int userId, String userType, String userName, String userPassword, String userEmail, String userMobile,
			String userAddress, String userPincode, String userAddedOn) {
		super();
		this.userId = userId;
		this.userType = userType;
		this.userName = userName;
		this.userPassword = userPassword;
		this.userEmail = userEmail;
		this.userMobile = userMobile;
		this.userAddress = userAddress;
		this.userPincode = userPincode;
		this.userAddedOn = userAddedOn;
	}
	public Users(String userType, String userName, String userPassword, String userEmail, String userMobile,
			String userAddress, String userPincode, String userAddedOn) {
		super();
		this.userType = userType;
		this.userName = userName;
		this.userPassword = userPassword;
		this.userEmail = userEmail;
		this.userMobile = userMobile;
		this.userAddress = userAddress;
		this.userPincode = userPincode;
		this.userAddedOn = userAddedOn;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getUserType() {
		return userType;
	}
	public void setUserType(String userType) {
		this.userType = userType;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserPassword() {
		return userPassword;
	}
	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}
	public String getUserEmail() {
		return userEmail;
	}
	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}
	public String getUserMobile() {
		return userMobile;
	}
	public void setUserMobile(String userMobile) {
		this.userMobile = userMobile;
	}
	public String getUserAddress() {
		return userAddress;
	}
	public void setUserAddress(String userAddress) {
		this.userAddress = userAddress;
	}
	public String getUserPincode() {
		return userPincode;
	}
	public void setUserPincode(String userPincode) {
		this.userPincode = userPincode;
	}
	public String getUserAddedOn() {
		return userAddedOn;
	}
	public void setUserAddedOn(String userAddedOn) {
		this.userAddedOn = userAddedOn;
	}
	@Override
	public String toString() {
		return "Users [userId=" + userId + ", userType=" + userType + ", userName=" + userName + ", userPassword="
				+ userPassword + ", userEmail=" + userEmail + ", userMobile=" + userMobile + ", userAddress="
				+ userAddress + ", userPincode=" + userPincode + ", userAddedOn=" + userAddedOn + "]";
	}
	
	
}
