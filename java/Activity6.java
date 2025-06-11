package activities;

public class Activity6 {
	public static void main(String[] args) {
		Plane plane = new Plane(10);
		
		plane.onboard("John");
		plane.onboard("Celia");
		plane.onboard("Naomi");
		
		System.out.println("Plane took off at: " + plane.setTakeOff());
		System.out.println("Passengers on the plane: "+ plane.getPassengers());
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		plane.setLand();
		
		System.out.println("Plane landed at: "+ plane.getLastTimeLanded());
		System.out.println("People onboard after landing: " + plane.getPassengers());
	}
}
