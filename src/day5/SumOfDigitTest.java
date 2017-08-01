package day5;

public class SumOfDigitTest {

	public static void main(String[] args) {

		int number = 12345;
		int sum = 0;
		int modulus = 0;
		while (number != 0) {
			modulus = number % 10;
			sum = sum + modulus;
			number = number / 10;
		}
		System.out.println(sum);

	}

}
