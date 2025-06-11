package activities;

public class Car {
	String color;
	String transmission;
	int make;
	int tyres;
	int doors;
	public Car(String color, String transmission, int make) {
		super();
		this.tyres = 4;
		this.doors = 4;
		this.color = color;
		this.transmission = transmission;
		this.make = make;
	}
	
	public void displayCharacteristics() {
		System.out.println("Color= "+this.color);
		System.out.println("Transmission= "+this.transmission);
		System.out.println("Make= "+this.make);
		System.out.println("Tyres= "+this.tyres);
		System.out.println("Doors= "+this.doors);
	}
	
	public void accelerate() {
		System.out.println("Car is moving forward");
	}
	
	public void brake() {
		System.out.println("Car has stopped");
	}
}
