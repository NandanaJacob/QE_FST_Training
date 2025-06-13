package activities;

//5. Take a string as an input. Output should be:
//One string with all the vowels
//One string with all the consonants
//One string with all the punctuations

public class PractiseQ_5 {

	public void separateCharacters(String input) {
	    String vowels = "";
	    String consonants = "";
	    String punctuations = "";

	    for (char ch : input.toCharArray()) {
	        if (Character.isLetter(ch)) {
	            if ("aeiouAEIOU".indexOf(ch) != -1) {
	                vowels += ch;
	            } else {
	                consonants += ch;
	            }
	        } else if (!Character.isDigit(ch) && !Character.isWhitespace(ch)) {
	            punctuations += ch;
	        }
	    }

	    System.out.println("Vowels: " + vowels);
	    System.out.println("Consonants: " + consonants);
	    System.out.println("Punctuations: " + punctuations);
	}

	public static void main(String[] args) {
		PractiseQ_5 obj = new PractiseQ_5();
		System.out.println("input = butterfly'nb, :");
		obj.separateCharacters("butterfly'nb,");
	}
}
