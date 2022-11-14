package com.springprojects.dojoninjasrelationships.models;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name = "dojos")
public class Dojos {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@NotNull
	@Size(min = 2, max = 255, message = "Sorry! but the name must be have 2-255 charachters")
	private String name;
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
    @OneToMany(mappedBy = "dojo", fetch = FetchType.LAZY)
    private List<Ninjas> ninjas;

	public Dojos() {
	}

	

	public Dojos(Long id, String name, List<Ninjas> ninjas) {
		super();
		this.id = id;
		this.name = name;
		this.ninjas = ninjas;
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

	public Date getCreatedAt() {
		return createdAt;
	}


	public Date getUpdatedAt() {
		return updatedAt;
	}

	public List<Ninjas> getNinjas() {
		return ninjas;
	}

	public void setNinjas(List<Ninjas> ninjas) {
		this.ninjas = ninjas;
	}


	
	
	
}
