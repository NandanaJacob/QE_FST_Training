package activities;

//4. Using recursion, implement 
//* Factorial of a number.
//* Print the Fibonnaci number at the given position.

public class PractiseQ_4 {
	
	public int factorial(int n) {
	    if (n == 0 || n == 1)
	        return 1;
	    return n * factorial(n - 1);
	}

	public int fibonacci(int n) {
	    if (n == 0)
	        return 0;
	    if (n == 1)
	        return 1;
	    return fibonacci(n - 1) + fibonacci(n - 2);
	}

	public static void main(String[] args) {
		PractiseQ_4 obj = new PractiseQ_4();
		
		System.out.println("Factorial of 5 = " + obj.factorial(5));
		System.out.println("Fibonacci of 5 = " + obj.fibonacci(5));
	}
}
