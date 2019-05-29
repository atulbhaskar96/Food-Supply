package com.example.demo.enums;

// TODO: Auto-generated Javadoc
/**
 * The Enum StateEnumTemp.
 */
public enum StateEnumTemp {

	/** The andhra pradesh. */
	ANDHRA_PRADESH(1, "Andhra Pradesh", 1),

	/** The arunachal pradesh. */
	ARUNACHAL_PRADESH(2, "Arunachal Pradesh", 1),

	/** The assam. */
	ASSAM(3, "Assam", 1),

	/** The bihar. */
	BIHAR(4, "Bihar", 1),

	/** The chahattisgarh. */
	CHAHATTISGARH(5, "Chhattisgarh", 1),

	/** The goa. */
	GOA(6, "Goa", 1),

	/** The gujarat. */
	GUJARAT(7, "Gujarat", 1),

	/** The haryana. */
	HARYANA(8, "Haryana", 1),

	/** The himachal pradesh. */
	HIMACHAL_PRADESH(9, "Himachal Pradesh", 1),

	/** The jammu and kashmir. */
	JAMMU_AND_KASHMIR(10, "Jammu and Kashmir", 1),

	/** The jharkhand. */
	JHARKHAND(11, "Jharkhand", 1),

	/** The karnataka. */
	KARNATAKA(12, "Karnataka", 1),

	/** The kerala. */
	KERALA(13, "Kerala", 1),

	/** The madhya pradesh. */
	MADHYA_PRADESH(14, "Madhya Pradesh", 1),

	/** The maharastra. */
	MAHARASTRA(15, "Maharashtra", 1),

	/** The manipur. */
	MANIPUR(16, "Manipur", 1),

	/** The meghalaya. */
	MEGHALAYA(17, "Meghalaya", 1),

	/** The mizoram. */
	MIZORAM(18, "Mizoram", 1),

	/** The nagaland. */
	NAGALAND(19, "Nagaland", 1),

	/** The odisha. */
	ODISHA(20, "Odisha", 1),

	/** The punjab. */
	PUNJAB(21, "Punjab", 1),

	/** The rajasthan. */
	RAJASTHAN(22, "Rajasthan", 1),

	/** The sikkim. */
	SIKKIM(23, "Sikkim", 1),

	/** The tamil nadu. */
	TAMIL_NADU(24, "Tamil Nadu", 1),

	/** The telangana. */
	TELANGANA(25, "Telangana", 1),

	/** The tripura. */
	TRIPURA(26, "Tripura", 1),

	/** The uttar pradesh. */
	UTTAR_PRADESH(27, "Uttar Pradesh", 1),

	/** The uttarakhand. */
	UTTARAKHAND(28, "Uttarakhand", 1),

	/** The west bengal. */
	WEST_BENGAL(29, "West Bengal", 1);

	/** The state id. */
	private int stateId;

	/** The state name. */
	private String stateName;

	/** The country id. */
	private int countryId;

	/**
	 * Instantiates a new state enum temp.
	 *
	 * @param stateId   the state id
	 * @param stateName the state name
	 * @param countryId the country id
	 */
	StateEnumTemp(int stateId, String stateName, int countryId) {
		this.countryId = countryId;
		this.stateId = stateId;
		this.stateName = stateName;
	}

}
