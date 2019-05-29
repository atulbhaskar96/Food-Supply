package com.example.demo.enums;

// TODO: Auto-generated Javadoc
/**
 * The Enum RoleEnum.
 */
public enum RoleEnum {

	/** The unknown. */
	UNKNOWN(0, "Inavlid user"),

	/** The admin. */
	ADMIN(1, "Admin User"),

	/** The buyer. */
	BUYER(2, "App Buyer User"),

	/** The merchant. */
	MERCHANT(3, "Merchant User"),

	/** The chef. */
	CHEF(4, "cHEF"),

	/** The kitchen. */
	KITCHEN(5, "KICTCHEN");

	/** The id. */
	private int id;

	/** The description. */
	private String description;

	/**
	 * Instantiates a new role enum.
	 *
	 * @param id          the id
	 * @param description the description
	 */
	RoleEnum(int id, String description) {
		this.setDescription(description);
		this.setId(id);
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

}
