package day2;

import java.util.Scanner;
/* Check given number is perfect number or not in java */

public class PerfectNumberTest {

	public static void main(String args[]) {
		System.out.println("Enter Number");
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		int duplicate = number;
		int sum = 0;
		for (int i = 1; i < number; i++) {
			if (number % i == 0) {
				sum += i;
			}
		}
		if (sum == duplicate) {
			System.out.println("Perfect Number");
		} else {
			System.out.println("No number is not perfect");
		}
	}
}
