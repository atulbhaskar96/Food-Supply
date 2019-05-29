package com.example.demo.bean;

/**
 * The Class AddressBean.
 */
public class AddressBean {

	/** The address id. */
	private long addressId;

	/** The city. */
	private CityBean city;

	/** The state. */
	private StateBean state;

	/** The country. */
	private CountryBean country;

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
	 * Gets the city.
	 *
	 * @return the city
	 */
	public CityBean getCity() {
		return city;
	}

	/**
	 * Sets the city.
	 *
	 * @param city the new city
	 */
	public void setCity(CityBean city) {
		this.city = city;
	}

	/**
	 * Gets the state.
	 *
	 * @return the state
	 */
	public StateBean getState() {
		return state;
	}

	/**
	 * Sets the state.
	 *
	 * @param state the new state
	 */
	public void setState(StateBean state) {
		this.state = state;
	}

	/**
	 * Gets the country.
	 *
	 * @return the country
	 */
	public CountryBean getCountry() {
		return country;
	}

	/**
	 * Sets the country.
	 *
	 * @param country the new country
	 */
	public void setCountry(CountryBean country) {
		this.country = country;
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
	 * Gets the model.
	 *
	 * @return the model
	 */
	/*
	 * public Address getModel() { Address address = new Address();
	 * address.setCity(this.city); address.setState(this.state);
	 * address.setHouseNo(this.houseNo); address.setLandMark(this.landMark);
	 * address.setPinCode(this.pinCode); address.setState(this.state);
	 * address.setStreet(this.street); return address; }
	 */

}
