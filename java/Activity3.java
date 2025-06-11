package activities;

public class Activity3 {
	public static void main(String[] args) {
		double age_sec = 1000000000;
		Activity3 obj = new Activity3();
		obj.findAge(age_sec);
	}
	
	public void findAge(double age) {
		System.out.println("Earth= "+ age/31557600);
		System.out.println("Mercury= "+ age/31557600/0.2408467);
		System.out.println("Venus= "+ age/31557600/0.61519726);
		System.out.println("Mars= "+ age/31557600/1.8808158);
		System.out.println("Jupiter= "+ age/31557600/11.862615);
		System.out.println("Saturn= "+ age/31557600/29.447498);
		System.out.println("Uranus= "+ age/31557600/84.016846);
		System.out.println("Neptune= "+ age/31557600/164.79132);
	}
}
