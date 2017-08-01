package day1;

import java.util.Scanner;

/*
 java program to check duck number

What is Duck Number ?
* A Duck number is a number which has zeroes present in it, 
but there should be no zero present in the beginning of the number.
 */
public class DuckNumberTest {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		int num = sc.nextInt();
		boolean flag = false;
		int mod = 0;
		while (num != 0) {
			if (num % 10 == 0) {
				flag = true;
			}
			num = num / 10;
		}
		if (flag == true) {
			System.out.println("Given number is duck number");
		} else {
			System.out.println("Given number is not duck number");
		}

	}

}
