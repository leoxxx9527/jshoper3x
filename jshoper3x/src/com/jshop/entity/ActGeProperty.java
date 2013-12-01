package com.jshop.entity;

// Generated 2013-12-1 22:37:45 by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * ActGeProperty generated by hbm2java
 */
@Entity
@Table(name = "act_ge_property", catalog = "jshoper3")
public class ActGeProperty implements java.io.Serializable {

	private String name;
	private String value;
	private Integer rev;

	public ActGeProperty() {
	}

	public ActGeProperty(String name) {
		this.name = name;
	}

	public ActGeProperty(String name, String value, Integer rev) {
		this.name = name;
		this.value = value;
		this.rev = rev;
	}

	@Id
	@Column(name = "NAME_", unique = true, nullable = false, length = 64)
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(name = "VALUE_", length = 300)
	public String getValue() {
		return this.value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	@Column(name = "REV_")
	public Integer getRev() {
		return this.rev;
	}

	public void setRev(Integer rev) {
		this.rev = rev;
	}

}
