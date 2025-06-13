package activities;

public class Activity12 {
	public static void main(String[] args) {
		Addable add1 = (num1, num2) -> num1+num2;
		
		Addable add2 = (num1, num2) -> {
			int result = num1 + num2;
			System.out.println("Inside body of lambda expression");
			return result;
		};
		
		System.out.println("3 + 4 = " + add1.add(3, 4) + " => without body lambda");
		System.out.println("5 + 6 = " + add2.add(5, 6) + " => with body lambda");
		
	}
}
