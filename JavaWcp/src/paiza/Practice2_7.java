package paiza;

import java.util.Scanner;

public class Practice2_7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		
		if(A >= 0) {
			System.out.println(A * A);
		} else if(B >= 0){
			System.out.println(A * B);
		} else {
			System.out.println(B * B);
		}
		
	}
}
