package activities;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

//Activity 13:
//* In this activity, accept number inputs from the console using Scanner class and store them in an array.
//* Then use the Random class to generate an index value and print the value in the array at then generated index value.
//* To start create a class RandomScannerActivity with a main() method with the following objects:
//    * Create a Scanner object named scan.
//    * Create an ArrayList object named list.
//    * Create a Random class object named indexGen.
//* Add a scan statement with nextInt() to accept only integer values, inside a loop to accept multiple values.
//* Use the hasNextInt() method with the loop to ensure only integer values are accepted.
//* To print the number from an array, we convert the ArrayList into an array using the toArray() method
//* Create an array as shown: Integer nums[] = list.toArray(new Integer[0]);
//* Use indexGen to generate an integer value with the bounds set to the length of nums array.
//* Print the index value that was generated and the value in the array at that index value.

public class Activity13 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		ArrayList list = new ArrayList();
		Random indexGen = new Random();
		
		 System.out.println("Enter integer values (non-integer to stop):");
	     while (scan.hasNextInt()) {
	         int num = scan.nextInt();
	         list.add(num);
	     }

	     Object[] nums = list.toArray(new Integer[0]);
	     
	     if (nums.length > 0) {
	            int randomIndex = indexGen.nextInt(nums.length);
	            System.out.println("Random index generated: " + randomIndex);
	            System.out.println("Value at that index: " + nums[randomIndex]);
	        } else {
	            System.out.println("No valid integers entered.");
	        }

	        scan.close();
	}
}
