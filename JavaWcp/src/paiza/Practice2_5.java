package paiza;

import java.util.Scanner;

public class Practice2_5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		int T = sc.nextInt();
		
		if(N * K > T) {
			System.out.println("NO");
		} else {
			System.out.println("YES");
		}
	}

}
