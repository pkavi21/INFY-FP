package org.veh;

import javax.persistence.Entity;

@Entity
public class FourWheeler extends Vehicle {

	public FourWheeler() {
		super();
		
	}
	
	public String getSteeringWheel() {
		return steeringWheel;
	}

	public void setSteeringWheel(String steeringWheel) {
		this.steeringWheel = steeringWheel;
	}

	private String steeringWheel;
	

}
