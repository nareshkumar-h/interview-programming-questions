package day1;

/*
 * Count occurrence of numbers in array using java
 */

public class CountOccurenceTest {

	public static void main(String args[]) {
		int arr[] = new int[] { 12, 67, 56, 2, 78, 5, 5 };
		java.util.Scanner sc = new java.util.Scanner(System.in);
		System.out.println("Enter number");
		int num = sc.nextInt();
		int counter = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == num) {
				counter++;
			}
		}
		System.out.println("Given number present " + counter + " times in array");
	}
}
