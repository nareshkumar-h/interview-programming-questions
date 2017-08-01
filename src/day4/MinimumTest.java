package day4;

/* how to find minimum value from array in java */

public class MinimumTest {

	public static void main(String[] args) {

		int arr[] = new int[]{12, 34, 3 , 78, 6,890};
	    int min = arr[0];
	    for(int i : arr){
	        if(i < min){
	            min = i;
	          }
	     }
	    System.out.println("Minimum value is: "+min);
	}

}
