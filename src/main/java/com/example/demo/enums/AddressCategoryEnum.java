package com.example.demo.enums;

// TODO: Auto-generated Javadoc
/**
 * The Enum AddressCategoryEnum.
 */
public enum AddressCategoryEnum {

	/** The home. */
	HOME(1, "Home Address"),

	/** The office. */
	OFFICE(2, "Office address"),

	/** The other. */
	OTHER(3, "Other Address");

	/** The id. */
	private int id;

	/** The description. */
	private String description;

	/**
	 * Instantiates a new address category enum.
	 *
	 * @param id          the id
	 * @param description the description
	 */
	AddressCategoryEnum(int id, String description) {
		this.id = id;
		this.description = description;
	}

	/**
	 * Gets the id.
	 *
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * Sets the id.
	 *
	 * @param id the new id
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * Gets the description.
	 *
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * Sets the description.
	 *
	 * @param description the new description
	 */
	public void setDescription(String description) {
		this.description = description;
	}
}
