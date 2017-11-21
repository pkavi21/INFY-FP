package org.veh;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name="VECHICLE_DETAILS")
public class Vehicle {
	
	public Vehicle() {
		
	}
	public int getVehicleId() {
		return vehicleId;
	}
	public void setVehicleId(int vehicleId) {
		this.vehicleId = vehicleId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Id
	@Column(name="VECHILE_ID")
	private int vehicleId;
	@Column(name="VEHICLE_NAME")
	private String name;

}
