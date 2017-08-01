package day2;

import java.util.Scanner;
/*
 * How to check strong number in java

145 = 1 ! + 4! + 5!= 145

 */
public class StrongNumberTest {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number");
		int number = sc.nextInt();
		int duplicate = number;
		int sum = 0;
		int f = 1;
		int mod = 0;
		while (number != 0) {
			mod = number % 10;
			for (int i = 1; i <= mod; i++) {
				f = f * i;
			}
			sum = sum + f;
			number = number / 10;
			f = 1;

		}
		if (sum == duplicate) {
			System.out.println("Strong Number");
		} else {
			System.out.println("Not Strong number");
		}
	}

}
