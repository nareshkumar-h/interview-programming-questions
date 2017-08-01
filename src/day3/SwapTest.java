package day3;

public class SwapTest {

	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		System.out.println("Numbers before swapping are " + a + " and " + b);
		int temp = 0;
		temp = a;
		a = b;
		b = temp;
		System.out.println("Numbers after swapping are " + a + " and " + b);
	}
}
