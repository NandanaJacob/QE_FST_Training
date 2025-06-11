package activities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Plane {
	private int maxPassengers;
	private List<String> passengers;
	private Date lastTimeTookOff;
	private Date lastTimeLanded;
	
	public Plane(int maxPassengers) {
		this.maxPassengers = maxPassengers;
		this.passengers = new ArrayList<String>();
	}
	
	public void onboard(String passengerName) {
		if(passengers.size() <= maxPassengers) {
			this.passengers.add(passengerName);
		}else {
			System.out.println("Plane is full");
		}
	}
	
	public Date setTakeOff() {
		this.lastTimeTookOff = new Date();
		return lastTimeTookOff;
	}
	
	public void setLand() {
		this.lastTimeLanded = new Date();
		this.passengers.clear();
	}
	
	public Date getLastTimeLanded() {
		return lastTimeLanded;
	}
	
	public List<String> getPassengers(){
		return passengers;
	}
	
}
