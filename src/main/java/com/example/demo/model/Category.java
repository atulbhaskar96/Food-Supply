package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * The Class Category.
 */
@Entity
@Table(name = "category", catalog = "test")
public class Category {

	/** The id. */
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	@Column(name = "category_id")
	private long id;

	/** The name. */
	@Column(name = "category_name")
	private String name;

	/** The icon image. */
	@Column(name = "icon_image")
	private String iconImage;

	/** The description. */
	private String description;

	/** The gst. */
	private int gst;

	/** The sgst. */
	private int sgst;

	/** The image. */
	private String image;

	/** The show in menu. */
	private boolean showInMenu;

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
	 * Gets the icon image.
	 *
	 * @return the icon image
	 */
	public String getIconImage() {
		return iconImage;
	}

	/**
	 * Sets the icon image.
	 *
	 * @param iconImage the new icon image
	 */
	public void setIconImage(String iconImage) {
		this.iconImage = iconImage;
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
	 * Gets the gst.
	 *
	 * @return the gst
	 */
	public int getGst() {
		return gst;
	}

	/**
	 * Sets the gst.
	 *
	 * @param gst the new gst
	 */
	public void setGst(int gst) {
		this.gst = gst;
	}

	/**
	 * Gets the sgst.
	 *
	 * @return the sgst
	 */
	public int getSgst() {
		return sgst;
	}

	/**
	 * Sets the sgst.
	 *
	 * @param sgst the new sgst
	 */
	public void setSgst(int sgst) {
		this.sgst = sgst;
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
	 * Checks if is show in menu.
	 *
	 * @return true, if is show in menu
	 */
	public boolean isShowInMenu() {
		return showInMenu;
	}

	/**
	 * Sets the show in menu.
	 *
	 * @param showInMenu the new show in menu
	 */
	public void setShowInMenu(boolean showInMenu) {
		this.showInMenu = showInMenu;
	}

}
