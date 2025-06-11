package activities;

public class Activity2 {
	public static void main(String[] args) {
		int[] arr = {10, 77, 10, 54, -11, 10};
		int[] anotherArr = {0, 0, 0, 10, 6, 2};

		Activity2 obj = new Activity2();
		
		int sum = obj.find10Sum(arr);
		obj.checkSum30(sum);
		
		int sum2 = obj.find10Sum(anotherArr);
		obj.checkSum30(sum2);
		
	}
	
	public int find10Sum(int[] arr) {
		int sum = 0;
		for(int num : arr) {
			if(num == 10) {
				sum += 10;
			}
		}
		return sum;
	}
	
	public void checkSum30(int sum) {
		if(sum == 30) {
			System.out.println("Sum is 30");
		}else {
			System.out.println("Sum NOT 30");
		}
	}
}
