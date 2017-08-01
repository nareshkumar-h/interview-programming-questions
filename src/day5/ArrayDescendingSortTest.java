package day5;

/* java program to sort an array in descending order */
public class ArrayDescendingSortTest {

	public static void main(String[] args) {

		int arr[] = new int[] { 12, 34, 5, 89, 76, 1 };
		int temp = 0;
		for (int i = 0; i <= arr.length - 1; i++) {
			for (int j = i; j < arr.length; j++) {
				if (arr[i] < arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(" " + arr[i]);
		}
	}

}
