package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * The Class SubCategory.
 */
@Entity
@Table(name = "sub_category", catalog = "test")
public class SubCategory {

	/** The id. */
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	@Column(name = "sub_category_id")
	private long id;

	/** The category id. */
	@ManyToOne
	@JoinColumn(name = "category_id", referencedColumnName = "category_id")
	private Category category;

	/** The name. */
	@Column(name = "sub_category_name")
	private String name;

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
	 * Gets the category id.
	 *
	 * @return the category id
	 */
	public Category getCategoryId() {
		return category;
	}

	/**
	 * Sets the category id.
	 *
	 * @param categoryId the new category id
	 */
	public void setCategoryId(Category category) {
		this.category = category;
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
