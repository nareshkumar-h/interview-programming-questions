package day2;

import java.util.Scanner;

/* How to check armstrong number in java

371 = 3*3*3 + 7*7*7 + 1*1*1 = 371*/

public class AmstrongTest {

	public static void main(String[] args) {
		System.out.println("Enter Number to check Armstrong");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int mod = 0;
		int sum = 0;
		int duplicate = num;
		while (num != 0) {
			mod = num % 10;
			sum = sum + (mod * mod * mod);
			num = num / 10;
		}
		if (sum == duplicate) {
			System.out.println("Armstrong Number");
		} else {
			System.out.println("Not Armstrong Number");
		}
	}

}
