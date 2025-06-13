package activities;

import java.util.HashMap;

//Activity 11:
//* Create a Map named colours with integer keys and String values.
//* Add 5 random colours to it and print the Map to the console.
//* Remove one colour using the remove() method.
//* Check if the colour green exists in the Map using the containsValue() method.
//* Print the size of the Map using the size() method

public class Activity11 {
	public static void main(String[] args) {
		HashMap<Integer, String> colours = new HashMap<>();
		colours.put(1, "Violet");
		colours.put(2, "Indigo");
		colours.put(3, "Blue");
		colours.put(4, "Green");
		colours.put(5, "Yellow");
		
		System.out.println("Removing colour Blue");
		colours.remove(3);
		
		System.out.println("Does colours contain Green? " + colours.containsValue("Green"));
		
		System.out.println("Size of colours = " + colours.size());
	}
}
