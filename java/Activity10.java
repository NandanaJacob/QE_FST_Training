package activities;

import java.util.HashSet;

//Activity 10:
//* Create a HashSet named hs.
//* Add 6 objects using add() method to the HashSet.
//* Then print the size of the HashSet using the size() method.
//* Remove an element using the remove() method.
//* Also try to remove an element that is not present in the Set.
//* Use the contains() method to check if an item is in the Set or not.
//* Print the updated set.

public class Activity10 {
	public static void main(String[] args) {
		HashSet hs = new HashSet();
		hs.add(1);
		hs.add(2);
		hs.add(3);
		hs.add(4);
		hs.add(5);
		hs.add(6);
		
		System.out.println("Size of hs = " + hs.size());
		
		System.out.println("Removing element 5");
		hs.remove(5);
		
		System.out.println("Removing element 7 that doesn't exist in hs");
		hs.remove(7);
		
		System.out.println("Is 3 present in hs? " + hs.contains(3));
		
		System.out.println("Final set = " + hs);
	}
}
