package day3;

public class MaxNumberTest {

	public static void main(String[] args) {

		int arr[] = new int[] { 12, 34, 3, 78, 6, 890 };
		int max = arr[0];
		for (int i : arr) {
			if (i > max) {
				max = i;
			}
		}
		System.out.println("Maximum value is: " + max);

	}

}
