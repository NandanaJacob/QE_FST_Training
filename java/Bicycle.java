package activities;

public class Bicycle implements BicycleParts, BicycleOperations{
	int gears;
	int currentSpeed;
	
	public Bicycle(int gears, int currentSpeed) {
		super();
		this.gears = gears;
		this.currentSpeed = currentSpeed;
	}
	
	@Override
	public void applyBrake(int decrement) {
		System.out.println("Cycle speed decreased.");
		if(currentSpeed != 0) {
			currentSpeed -= decrement;
		}else {
			System.out.println("Cycle stopped.");
		}
	}
	
	@Override
	public void speedUp(int increment) {
		System.out.println("Cycle speed increased.");
		if(currentSpeed <= maxSpeed) {
			currentSpeed -= increment;
		}else {
			System.out.println("Cycle is at max speed.");
		}
	}
	
	//describe bicycle function
	public void bicycleDesc() {
		System.out.println("Bicycle has  "+gears+" gears, " + tyres+ " tyres and a max speed of "+ maxSpeed);
		System.out.println("Its current speed is " + currentSpeed);
	}
}
