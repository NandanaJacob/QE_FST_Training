package activities;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

//3. Given a list, check for duplicate numbers. 
// Throw a custom excpetion - DuplicateNumberException - if there are any

class DuplicateNumberException extends Exception{
	private String message;

	public DuplicateNumberException(String message) {
		super();
		this.message = message;
	}
	
	@Override
	public String getMessage() {
		return this.message;
	}
}

public class PractiseQ_3 {
	public void DuplicateNumberExceptionTest(List<Integer> numbers) throws DuplicateNumberException {
		 Set<Integer> seen = new HashSet<>();
	        boolean hasDuplicate = false;

	        for (int num : numbers) {
	            if (!seen.add(num)) {
	                System.out.println("Duplicate found: " + num);
	                hasDuplicate = true;
	                throw new DuplicateNumberException("String contains duplicates = " + num);
	            }
	        }

	        if (!hasDuplicate) {
	            System.out.println("No duplicates found.");
	        }
		
	}
	
	public static void main(String[] args) {
		PractiseQ_3 obj = new PractiseQ_3();
		 List<Integer> numbers = Arrays.asList(1, 3, 5, 2, 4, 3, 6);
		try {
			obj.DuplicateNumberExceptionTest(numbers);
		}catch(DuplicateNumberException e){
			System.out.println("Error: "+ e.getMessage());
		}
		
		System.out.println("End of program ");
	}
}
