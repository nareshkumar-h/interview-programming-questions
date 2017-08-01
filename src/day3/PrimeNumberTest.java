package day3;

import java.util.Scanner;

public class PrimeNumberTest {

	public static void main(String[] args) {

		System.out.println("Enter number to check prime number");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int counter = 0;
		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				counter++;
			}
		}
		if (counter == 0) {
			System.out.println(num + " is prime number");
		} else {
			System.out.println(num + " is not prime number");
		}
	}

}
