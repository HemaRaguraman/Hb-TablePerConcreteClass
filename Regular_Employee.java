package com.model;

import jakarta.persistence.AttributeOverride;
import jakarta.persistence.AttributeOverrides;
import jakarta.persistence.Column;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

	@Entity
	@Table(name="Regularemployee101")
	@AttributeOverrides({
	@AttributeOverride(name="id",column=@Column(name="id")),
	@AttributeOverride(name="name",column=@Column(name="name"))
	})
	public class Regular_Employee extends Employee{
		private float salary;
		private String dept;
		
		
		
		public Regular_Employee(float salary, String dept,String name) {
			super(name);
			this.salary = salary;
			this.dept = dept;
			this.name=name;
		}
		public Regular_Employee() {
			super();
		}
		public float getSalary() {
			return salary;
		}
		public void setSalary(float salary) {
			this.salary = salary;
		}
		public String getDept() {
			return dept;
		}
		public void setDept(String dept) {
			this.dept = dept;
		}

	}


