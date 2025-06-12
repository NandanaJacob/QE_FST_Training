package activities;

import java.util.ArrayList;

public class Activity9 {
	public static void main(String[] args) {
		ArrayList<String> myList = new ArrayList<>();
		myList.add("NameA");
		myList.add("NameB");
		myList.add("NameC");
		myList.add("NameD");
		myList.add("NameE");
		for(String name: myList) {
			System.out.println(name);
		}
		System.out.println("Third name = " + myList.get(2));
		System.out.println("Does myList contain the name NameE? ... " + myList.contains("NameE"));
		System.out.println("No.of names in myList = " + myList.size());
		System.out.println("Removing the name NameC...");
		myList.remove(2);
		System.out.println("No.of names in myList after removing NameC = " + myList.size());
	}
}
