package com.model;

import jakarta.persistence.AttributeOverride;
import jakarta.persistence.AttributeOverrides;
import jakarta.persistence.Column;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;


	@Entity
	@AttributeOverrides({
		@AttributeOverride(name="id",column=@Column(name="id")),
		@AttributeOverride(name="name",column=@Column(name="name"))
		})
	public class Trainee1 extends Employee {
	private float payperhour;
	private String contractperiod;
	public Trainee1() {
		super();
	}


	public Trainee1(float payperhour, String contractperiod,String name) {
		super(name);
		this.payperhour = payperhour;
		this.contractperiod = contractperiod;
		this.name=name;
	}
	public float getPayperhour() {
		return payperhour;
	}
	public void setPayperhour(float payperhour) {
		this.payperhour = payperhour;
	}
	public String getContractperiod() {
		return contractperiod;
	}
	public void setContractperiod(String contractperiod) {
		this.contractperiod = contractperiod;
	}

	}


