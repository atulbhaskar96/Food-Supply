package com.example.demo.enums;

// TODO: Auto-generated Javadoc
/**
 * The Enum StatusEnum.
 */
public enum StatusEnum {

	/** The new. */
	NEW(1, "New Status"),

	/** The kycpending. */
	KYCPENDING(2, "KYC Pending"),

	/** The kycapproved. */
	KYCAPPROVED(3, "KYC Approved");

	/** The id. */
	private int id;

	/** The description. */
	private String description;

	/**
	 * Instantiates a new status enum.
	 *
	 * @param id the id
	 * @param description the description
	 */
	StatusEnum(int id, String description) {
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
