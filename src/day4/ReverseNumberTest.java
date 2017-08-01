package day4;

public class ReverseNumberTest {

	public static void main(String[] args) {

		int num = 12345;
		int copy = num;
		int reverseNumber = 0;
		int mod = 0;
		while (copy != 0) {
			mod = copy % 10;
			reverseNumber = reverseNumber * 10 + mod;
			copy = copy / 10;
		}
		System.out.println("Original Number: " + num);
		System.out.println("Reversed Number: " + reverseNumber);
	}

}
