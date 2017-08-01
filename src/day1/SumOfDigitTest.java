package day1;

/* Java program to print sum of 1 to 100 number */
public class SumOfDigitTest {

	public static void main(String[] args) {

		int sum = 0;
		for (int i = 1; i <= 100; i++) {
			sum += i;
		}
		System.out.println("Sum of digit " + sum);
	}

}
