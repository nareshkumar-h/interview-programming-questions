package day2;

import java.util.Scanner;

/*java program to find area of circle */
public class AreaOfCircleTest {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Radius value");
		int r = sc.nextInt();
		final double PI = 3.141;
		double area = PI * r * r;
		System.out.println("Area of Circle is " + area);
	}

}
