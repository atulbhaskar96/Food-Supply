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

/**
 * The Class City.
 */
@Entity
@Table(name="city", catalog="test")
public class City {

	/** The id. */
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	@Column(name="city_id")
	private int id;
	
	/** The name. */
	@Column(name = "state_name")
	private String name;
	
	/** The state. */
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn( name = "state_id")
	private State state;

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
	 * Gets the state.
	 *
	 * @return the state
	 */
	public State getState() {
		return state;
	}

	/**
	 * Sets the state.
	 *
	 * @param state the new state
	 */
	public void setState(State state) {
		this.state = state;
	}

}
