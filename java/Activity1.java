package activities;

public class Activity1 {
	public static void main(String[] args) {
		Car car = new Car("Black", "Manual", 2014);
		car.displayCharacteristics();
		car.accelerate();
		car.brake();
	}
	
}
