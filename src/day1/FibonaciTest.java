package day1;

/*
Program to print fibonacci pattern in java
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
3
5  8
13     21    34
55    89    144   233
377  61 0 987  1597  2584

 */
public class FibonaciTest {

	public static void main(String[] args) {

		int p = 1;
		int c = 1;
		int n = p + c;
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				p = c;
				c = n;
				n = p + c;
				System.out.print(" " + n);
			}
			System.out.println();
		}

	}

}
