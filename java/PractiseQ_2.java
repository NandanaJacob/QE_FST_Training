package activities;

//2. Write the logic for a BinarySearch.

public class PractiseQ_2 {
	
	public void BinarySearch(int[] arr, int value) {
		int low = 0;
	    int high = arr.length - 1;

	    while (low <= high) {
	        int mid = (low + high) / 2;

	        if (arr[mid] == value) {
	            System.out.println("Value found at index: " + mid);
	            return;
	        } else if (arr[mid] < value) {
	            low = mid + 1;
	        } else {
	            high = mid - 1;
	        }
	    }

	    System.out.println("Value not found in the array.");
	}
	
	public static void main(String[] args) {
		int[] arr1 = {1, 2, 3, 4, 5};
		
		PractiseQ_2 obj = new PractiseQ_2();
		obj.BinarySearch(arr1, 4);
		obj.BinarySearch(arr1, 8);
	}
}
