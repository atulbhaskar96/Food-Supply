package com.example.demo.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.example.demo.enums.AddressCategoryEnum;

/**
 * The Class Address.
 */
@Entity
@Table(name = "user_address_test", catalog = "test")
public class Address {

	/** The address id. */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "address_id")
	private long addressId;

	/** The city. */
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "city_id", referencedColumnName = "city_id")
	private City city;

	/** The address category. */
	@Column(name = "address_category")
	private AddressCategoryEnum addressCategory;

	/** The pin code. */
	private String pinCode;

	/** The land mark. */
	private String landMark;

	/** The house no. */
	private String houseNo;

	/** The street. */
	private String street;

	/** The user id. */
	private long userId;

	/** The cuurently active. */
	private boolean curentlyActive;

	/**
	 * Gets the address id.
	 *
	 * @return the address id
	 */
	public long getAddressId() {
		return addressId;
	}

	/**
	 * Sets the address id.
	 *
	 * @param addressId the new address id
	 */
	public void setAddressId(long addressId) {
		this.addressId = addressId;
	}

	/**
	 * Gets the pin code.
	 *
	 * @return the pin code
	 */
	public String getPinCode() {
		return pinCode;
	}

	/**
	 * Sets the pin code.
	 *
	 * @param pinCode the new pin code
	 */
	public void setPinCode(String pinCode) {
		this.pinCode = pinCode;
	}

	/**
	 * Gets the land mark.
	 *
	 * @return the land mark
	 */
	public String getLandMark() {
		return landMark;
	}

	/**
	 * Sets the land mark.
	 *
	 * @param landMark the new land mark
	 */
	public void setLandMark(String landMark) {
		this.landMark = landMark;
	}

	/**
	 * Gets the house no.
	 *
	 * @return the house no
	 */
	public String getHouseNo() {
		return houseNo;
	}

	/**
	 * Sets the house no.
	 *
	 * @param houseNo the new house no
	 */
	public void setHouseNo(String houseNo) {
		this.houseNo = houseNo;
	}

	/**
	 * Gets the street.
	 *
	 * @return the street
	 */
	public String getStreet() {
		return street;
	}

	/**
	 * Sets the street.
	 *
	 * @param street the new street
	 */
	public void setStreet(String street) {
		this.street = street;
	}

	/**
	 * Gets the city.
	 *
	 * @return the city
	 */
	public City getCity() {
		return city;
	}

	/**
	 * Sets the city.
	 *
	 * @param city the new city
	 */
	public void setCity(City city) {
		this.city = city;
	}

	/**
	 * Gets the address category.
	 *
	 * @return the address category
	 */
	public AddressCategoryEnum getAddressCategory() {
		return addressCategory;
	}

	/**
	 * Sets the address category.
	 *
	 * @param addressCategory the new address category
	 */
	public void setAddressCategory(AddressCategoryEnum addressCategory) {
		this.addressCategory = addressCategory;
	}

	/**
	 * Gets the user id.
	 *
	 * @return the user id
	 */
	public long getUserId() {
		return userId;
	}

	/**
	 * Sets the user id.
	 *
	 * @param userId the new user id
	 */
	public void setUserId(long userId) {
		this.userId = userId;
	}

	/**
	 * Checks if is cuurently active.
	 *
	 * @return true, if is cuurently active
	 */
	public boolean isCuurentlyActive() {
		return curentlyActive;
	}

	/**
	 * Sets the cuurently active.
	 *
	 * @param cuurentlyActive the new cuurently active
	 */
	public void setCuurentlyActive(boolean curentlyActive) {
		this.curentlyActive = curentlyActive;
	}

}
