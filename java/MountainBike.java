package activities;

public class MountainBike extends Bicycle{
	int seatHeight;
	
	public MountainBike(int gears, int currentSpeed, int seatHeight) {
		super(gears, currentSpeed);
		this.seatHeight = seatHeight;
	}

	//set height ka functin
	public void setHeight(int newValue) {
		this.seatHeight = newValue;
	}
	
	//override for desc function in Bicycle class
	@Override
	public void bicycleDesc() {
		System.out.println("MountainBike has  "+gears+" gears, " + tyres+ " tyres and a max speed of "+ maxSpeed);
		System.out.println("Its current speed is " + currentSpeed);
		System.out.println("MountainBike ka current height is " + seatHeight);
	}
}
