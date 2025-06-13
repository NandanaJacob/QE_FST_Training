package activities;

import java.util.Scanner;

// 1. Compare three numbers - x, y, and z. 
// Print whether all are equal, two are equal, or all are not equal.

public class PractiseQ_1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter x, y, z");
		int x = sc.nextInt();
		int y = sc.nextInt();
		int z = sc.nextInt();
		
		if(x == y && y == z) {
			System.out.println("All are equal");
		}else if(x == y || y == z || x == z) {
			System.out.println("Two are equal");
		}else {
			System.out.println("None are same");
		}
	}
}
