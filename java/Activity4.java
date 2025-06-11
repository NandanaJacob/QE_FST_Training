package activities;

public class Activity4 {
	public static void main(String[] args) {
		int[] arr = {4, 3, 2, 10, 12, 1, 5, 6};
		
		Activity4 obj = new Activity4();
		obj.insertionSort(arr);
	}
	
	public void insertionSort(int[] arr) {
		int n = arr.length;
		int temp;
		for(int i=0; i<n; i++) {
			//int place = arr[i];
			for(int j=i+1; j<n; j++) {
				if(arr[j]<arr[i]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
				System.out.println();
				for(int num: arr) {
					System.out.print(" " + num);
				}
			}
		}
	}
}

