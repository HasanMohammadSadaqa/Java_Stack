package com.springprojects.dojoninjasrelationships.models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Table;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name = "ninjas")
public class Ninjas {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	@NotNull(message="First name can't be blank")
	@Size(min = 2, max = 255, message = "First name must have 2 - 255 charachters")
	private String firstName;
	@NotNull(message="Last name can't be blank")
	@Size(min = 2, max = 255, message = "Last name must have 2 - 255 charachters")
	private String lastName;
	@NotNull(message="Age can't be blank")
	@Min(value=20, message="age must be +20")
	private Integer age;
	@Column(updatable = false)
	private Date createdAt;
	private Date updatedAt;
	
	@PrePersist
	public void onCreated() {
		this.createdAt = new Date();
	}
	
	@PreUpdate 
	public void onUpdate() {
		this.updatedAt = new Date();
	}
	
	 @ManyToOne(fetch = FetchType.LAZY)
	 @JoinColumn(name = "dojo_id")
	 private Dojos dojo;

	public Ninjas() {
	}

	public Ninjas(String firstName, String lastName, Integer age, Dojos dojo) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.dojo = dojo;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public Date getCreatedAt() {
		return createdAt;
	}

	public Date getUpdatedAt() {
		return updatedAt;
	}

	public Dojos getDojo() {
		return dojo;
	}

	public void setDojo(Dojos dojo) {
		this.dojo = dojo;
	}
	 
	 
	
}
