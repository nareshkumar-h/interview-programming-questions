package day3;

public class SwapWithoutThirdVariable {

	public static void main(String[] args) {

		int a = 10;
		int b = 20;
		System.out.println("Numbers without swapping: " + a + " and " + b);
		a = a + b;// 10 + 20 = 30
		b = a - b;// 30 - 20 = 10
		a = a - b;// 30 - 10
		System.out.println("Numbers after swapping: " + a + " and " + b);
	}

}
