package day1;

import java.util.Scanner;

/* Java program to search an element in array */
public class ArraySearchTest {

	public static void main(String args[]) {
		int arr[] = new int[] { 12, 45, 78, 3, 90, 2 };
		boolean flag = false;
		int index = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number to search");
		int search = sc.nextInt();
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == search) {
				flag = true;
				index = i;
			}
		}
		if (flag == true) {
			System.out.println("Element found at " + index);
		} else {
			System.out.println("Element not found");
		}
	}
}
