package activities;

class CustomException extends Exception{
	private String message;

	public CustomException(String message) {
		super();
		this.message = message;
	}
	
	@Override
	public String getMessage() {
		return this.message;
	}
}

public class Activity8 {
	public void exceptionTest(String msg) throws CustomException {
		if(msg == null) {
			throw new CustomException("String is null");
		}else {
			System.out.println(msg);
		}
	}
	public static void main(String[] args) {
		Activity8 obj = new Activity8();
		try {
			obj.exceptionTest("This should print to console.");
			obj.exceptionTest(null);
		}catch(CustomException e){
			System.out.println("Error: "+ e.getMessage());
		}
		
		System.out.println("End of program ");
	}
}
