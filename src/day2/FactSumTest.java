package day2;

import java.util.Scanner;

/* 
 * Java program to find sum of the factorial series.
 * Java program to find sum of the series 1/1! + 2/2! + 3/3! +
 */
public class FactSumTest {

	public static void main(String[] args) {

		System.out.println("Enter number");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int f = 1;
		double sum = 0;
		for (int i = 1; i <= num; i++) {
			f = f * i;
			sum = sum + (i / f);
		}
		System.out.println(sum);
	}
}
