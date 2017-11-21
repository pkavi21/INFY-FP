package org.veh;

import javax.persistence.Entity;

@Entity
public class TwoWheeler extends Vehicle {

	public TwoWheeler() {
		super();
	}

	public String getSteeringHandle() {
		return steeringHandle;
	}

	public void setSteeringHandle(String steeringHandle) {
		this.steeringHandle = steeringHandle;
	}
	
	private String steeringHandle;

}
