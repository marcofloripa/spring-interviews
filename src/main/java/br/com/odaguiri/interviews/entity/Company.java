package br.com.odaguiri.interviews.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Company implements Serializable {

	private static final long serialVersionUID = -4858673727238353253L;

	@Id
	@GeneratedValue
	private Long id;
	
	private String name;
	
	private String country;
	
	private String timeZone;
	
	public Company() {
		super();
	}

	public Company(String name, String country, String timeZone) {
		super();
		this.name = name;
		this.country = country;
		this.timeZone = timeZone;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getTimeZone() {
		return timeZone;
	}

	public void setTimeZone(String timeZone) {
		this.timeZone = timeZone;
	}
	
}
