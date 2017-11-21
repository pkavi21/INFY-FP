package org.emp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

//@Entity
//@Table(name = "EMPLOYEE_DETAILS")

public class Employee {

	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public Employee(int id, String name, String email, long phone) {

		this.id = id;
		this.name = name;
		this.email = email;
		this.phone = phone;

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public long getPhone() {
		return phone;
	}

	public void setPhone(long phone) {
		this.phone = phone;
	}
	

	public double getBasicSalary() {
		return basicSalary;
	}

	public void setBasicSalary(double basicSalary) {
		this.basicSalary = basicSalary;
	}

	public float getTravelAllowance() {
		return travelAllowance;
	}

	public void setTravelAllowance(float travelAllowance) {
		this.travelAllowance = travelAllowance;
	}

	public float getHouseRentAllowance() {
		return houseRentAllowance;
	}

	public void setHouseRentAllowance(float houseRentAllowance) {
		this.houseRentAllowance = houseRentAllowance;
	}

	public float getDearnessAllowance() {
		return dearnessAllowance;
	}

	public void setDearnessAllowance(float dearnessAllowance) {
		this.dearnessAllowance = dearnessAllowance;
	}

	public float getProvidentFund() {
		return providentFund;
	}

	public void setProvidentFund(float providentFund) {
		this.providentFund = providentFund;
	}

	public float getNetSalary() {
		return netSalary;
	}

	public void setNetSalary(float netSalary) {
		this.netSalary = netSalary;
	}


	//@Id
	//@GeneratedValue
	//@Column(name = "EMP_ID")
	private int id;
	//@Column(name = "EMP_NAME", length = 150, nullable = false)
	private String name;
	//@Column(name = "EMIL_ID", length = 50, nullable = false, unique = true)
	private String email;
	//@Column(name = "PHN_NO", length = 10, nullable = false, unique = true)
	private long phone;
	//@Column(name = "BS")
	private double basicSalary;
	//@Column(name = "TA")
	private float travelAllowance;
	//@Column(name = "HRA")
	private float houseRentAllowance;
	//@Column(name = "DA")
	private float dearnessAllowance;
	//@Column(name = "PF")
	private float providentFund;
	//@Transient
	private float netSalary;

}
