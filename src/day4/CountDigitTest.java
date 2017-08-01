package day4;

/* How to count the number of digits in an int value */
public class CountDigitTest {

	public static void main(String[] args) {

		int num = 12345;
		int counter = 0;
		while (num != 0) {
			counter++;
			num /= 10;
		}
		System.out.println(counter);
	}

}
