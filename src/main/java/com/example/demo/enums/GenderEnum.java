package com.example.demo.enums;

/**
 * The Enum GenderEnum.
 */
public enum GenderEnum {

	/** The male. */
	MALE(1, "Male"),

	/** The female. */
	FEMALE(2, "Female"),

	/** The other. */
	OTHER(3, "Other");

	/** The id. */
	private int id;

	/** The description. */
	private String description;

	/**
	 * Instantiates a new gender enum.
	 *
	 * @param id          the id
	 * @param description the description
	 */
	GenderEnum(int id, String description) {
		this.id = id;
		this.description = description;
	}
}
