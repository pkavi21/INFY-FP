package org.emp;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
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

	
	
	@Id
	private int id;
	private String name;
	private String email;
	private long phone;

}
