package paiza;

import java.util.Scanner;

public class Practice2_2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] A = new int[N];
		
		for(int i = 0; i < N; i++) {
			A[i] = sc.nextInt();
		}
		
		int ans = 0;
		for(int n : A) {
			if(n % 2 != 0) {
				break;
			}
			ans +=n;
		}
		
		System.out.println(ans);
	}

}
