package paiza;

import java.util.Scanner;

public class Practice2_3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		int M;
		
		for(M = 0; N < K; M++ ) {
			N *= 2;
		}
		
		System.out.println(M);
	}

}
