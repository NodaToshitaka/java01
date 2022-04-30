package paiza;

import java.util.Scanner;

public class Practice2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int A = sc.nextInt();
		int B = sc.nextInt();
		
		int n = Math.abs(N);
		int a = Math.abs(A);
		int b = Math.abs(B);
		
		if(n == Math.abs(a -b) || n == Math.abs(a + b)) {
			System.out.println("yes");
		} else {
			System.out.println("no");
		}
	}

}
