package com.example.demo.bean;

import java.util.Date;
import java.util.List;

import com.example.demo.enums.GenderEnum;
import com.example.demo.enums.RoleEnum;

/**
 * The Class User.
 */
public class User {

	/** The id. */
	private long id;

	/** The name. */
	private String name;

	/** The password. */
	private String password;

	/** The role. */
	private RoleEnum role;

	/** The email. */
	private String email;

	/** The mobile. */
	private String mobile;

	/** The gender. */
	private GenderEnum gender;

	/** The image. */
	private String image;

	/** The address. */
	private List<AddressBean> address;

	/** The login status. */
	private boolean loginStatus;

	/** The active status. */
	private boolean activeStatus;

	/** The creation date. */
	private Date creationDate;

	/** The updation date. */
	private Date updationDate;

	/** The verified. */
	private boolean verified;

	/** The rating. */
	private int rating;

	/** The level. */
	private int level;

	/** The is kitchen close. */
	private boolean isKitchenClose;

	/** The stop order recieve. */
	private boolean stopOrderRecieve;

	/**
	 * Gets the id.
	 *
	 * @return the id
	 */
	public long getId() {
		return id;
	}

	/**
	 * Sets the id.
	 *
	 * @param id the new id
	 */
	public void setId(long id) {
		this.id = id;
	}

	/**
	 * Gets the name.
	 *
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * Sets the name.
	 *
	 * @param name the new name
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * Gets the password.
	 *
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * Sets the password.
	 *
	 * @param password the new password
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * Gets the role.
	 *
	 * @return the role
	 */
	public RoleEnum getRole() {
		return role;
	}

	/**
	 * Sets the role.
	 *
	 * @param role the new role
	 */
	public void setRole(RoleEnum role) {
		this.role = role;
	}

	/**
	 * Gets the email.
	 *
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * Sets the email.
	 *
	 * @param email the new email
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * Gets the mobile.
	 *
	 * @return the mobile
	 */
	public String getMobile() {
		return mobile;
	}

	/**
	 * Sets the mobile.
	 *
	 * @param mobile the new mobile
	 */
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	/**
	 * Gets the gender.
	 *
	 * @return the gender
	 */
	public GenderEnum getGender() {
		return gender;
	}

	/**
	 * Sets the gender.
	 *
	 * @param gender the new gender
	 */
	public void setGender(GenderEnum gender) {
		this.gender = gender;
	}

	/**
	 * Gets the image.
	 *
	 * @return the image
	 */
	public String getImage() {
		return image;
	}

	/**
	 * Sets the image.
	 *
	 * @param image the new image
	 */
	public void setImage(String image) {
		this.image = image;
	}

	/**
	 * Gets the address.
	 *
	 * @return the address
	 */
	public List<AddressBean> getAddress() {
		return address;
	}

	/**
	 * Sets the address.
	 *
	 * @param address the new address
	 */
	public void setAddress(List<AddressBean> address) {
		this.address = address;
	}

	/**
	 * Checks if is login status.
	 *
	 * @return true, if is login status
	 */
	public boolean isLoginStatus() {
		return loginStatus;
	}

	/**
	 * Sets the login status.
	 *
	 * @param loginStatus the new login status
	 */
	public void setLoginStatus(boolean loginStatus) {
		this.loginStatus = loginStatus;
	}

	/**
	 * Checks if is active status.
	 *
	 * @return true, if is active status
	 */
	public boolean isActiveStatus() {
		return activeStatus;
	}

	/**
	 * Sets the active status.
	 *
	 * @param activeStatus the new active status
	 */
	public void setActiveStatus(boolean activeStatus) {
		this.activeStatus = activeStatus;
	}

	/**
	 * Gets the creation date.
	 *
	 * @return the creation date
	 */
	public Date getCreationDate() {
		return creationDate;
	}

	/**
	 * Sets the creation date.
	 *
	 * @param creationDate the new creation date
	 */
	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}

	/**
	 * Gets the updation date.
	 *
	 * @return the updation date
	 */
	public Date getUpdationDate() {
		return updationDate;
	}

	/**
	 * Sets the updation date.
	 *
	 * @param updationDate the new updation date
	 */
	public void setUpdationDate(Date updationDate) {
		this.updationDate = updationDate;
	}

	/**
	 * Checks if is verified.
	 *
	 * @return true, if is verified
	 */
	public boolean isVerified() {
		return verified;
	}

	/**
	 * Sets the verified.
	 *
	 * @param verified the new verified
	 */
	public void setVerified(boolean verified) {
		this.verified = verified;
	}

	/**
	 * Gets the rating.
	 *
	 * @return the rating
	 */
	public int getRating() {
		return rating;
	}

	/**
	 * Sets the rating.
	 *
	 * @param rating the new rating
	 */
	public void setRating(int rating) {
		this.rating = rating;
	}

	/**
	 * Gets the level.
	 *
	 * @return the level
	 */
	public int getLevel() {
		return level;
	}

	/**
	 * Sets the level.
	 *
	 * @param level the new level
	 */
	public void setLevel(int level) {
		this.level = level;
	}

	/**
	 * Checks if is kitchen close.
	 *
	 * @return true, if is kitchen close
	 */
	public boolean isKitchenClose() {
		return isKitchenClose;
	}

	/**
	 * Sets the kitchen close.
	 *
	 * @param isKitchenClose the new kitchen close
	 */
	public void setKitchenClose(boolean isKitchenClose) {
		this.isKitchenClose = isKitchenClose;
	}

	/**
	 * Checks if is stop order recieve.
	 *
	 * @return true, if is stop order recieve
	 */
	public boolean isStopOrderRecieve() {
		return stopOrderRecieve;
	}

	/**
	 * Sets the stop order recieve.
	 *
	 * @param stopOrderRecieve the new stop order recieve
	 */
	public void setStopOrderRecieve(boolean stopOrderRecieve) {
		this.stopOrderRecieve = stopOrderRecieve;
	}

	/**
	 * Gets the model.
	 *
	 * @return the model
	 */
	/*
	 * public UserAdmin getModel() { UserAdmin userAdmin = new UserAdmin(); try {
	 * userAdmin.setActiveStatus(this.activeStatus); if (this.address == null ||
	 * this.address.isEmpty()) { throw new RuntimeException("invalid address"); }
	 * List<Address> address = new LinkedList<Address>(); for (AddressBean
	 * addressBean : this.address) { address.add(addressBean.getModel()); }
	 * userAdmin.setAddress(address); if (this.creationDate == null) {
	 * this.creationDate = new Date(); }
	 * userAdmin.setCreationDate(this.creationDate); userAdmin.setEmail(this.email);
	 * userAdmin.setGender(this.gender); userAdmin.setImage(this.image);
	 * userAdmin.setKitchenClose(this.isKitchenClose);
	 * userAdmin.setLevel(this.level); userAdmin.setLoginStatus(this.loginStatus);
	 * userAdmin.setMobile(this.mobile); userAdmin.setName(this.name);
	 * userAdmin.setPassword(this.password); userAdmin.setRating(this.rating);
	 * userAdmin.setRole(this.role);
	 * userAdmin.setStopOrderRecieve(this.stopOrderRecieve); if (this.updationDate
	 * == null) { this.updationDate = new Date(); }
	 * userAdmin.setUpdationDate(this.updationDate);
	 * userAdmin.setVerified(this.verified); } catch(Exception e) {
	 * e.printStackTrace(); } return userAdmin; }
	 */

}
