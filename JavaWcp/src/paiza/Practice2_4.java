package paiza;

import java.util.Scanner;

public class Practice2_4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		int T = sc.nextInt();
		
		if((T * K) % N == 0) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
			System.out.println((N * K) % T);
		}
	}

}
