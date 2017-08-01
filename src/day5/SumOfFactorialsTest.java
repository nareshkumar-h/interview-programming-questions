package day5;

import java.util.Scanner;

/* Sum of factorial series program in java 4! + 3! + 2! + 1! = 33
 */

public class SumOfFactorialsTest {

	public static void main(String[] args) {

		System.out.println("Enter Number");
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		int f = 1;
		int sum = 0;
		for (int i = number; i >= 1; i--) {
			for (int j = i; j >= 1; j--) {
				f = f * j;
			}
			sum = sum + f;
			f = 1;
		}
		System.out.println(sum);
	}

}
