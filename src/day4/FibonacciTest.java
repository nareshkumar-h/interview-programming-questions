package day4;

/*
Print fibonacci series using java
Output: 1 1 3 5 8 13 21 34 55
*/
public class FibonacciTest {

	public static void main(String[] args) {

		int p = 1;
	    int c= 1;
	    int n = p + c;
	    System.out.print(p +" "+c);
	    while(n < 50){
	       c = p ;
	       p = n;
	       n = p + c;
	       System.out.print(" "+n);
	     }
	}

}
