package paiza;

import java.util.Scanner;

public class Practice2_10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    int N = sc.nextInt();
	    
	    if(N % 15 == 0) {
	        System.out.println("FizzBuzz");
	    } else if(N % 5 == 0) {
	        System.out.println("Buzz");
	    } else if(N % 3 == 0) {
	        System.out.println("Fizz");
	    } else {
	        System.out.println(N); 
	    }
	}

}
