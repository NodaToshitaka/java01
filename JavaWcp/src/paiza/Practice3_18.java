package paiza;

import java.util.Scanner;

public class Practice3_18 {
	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        int n = sc.nextInt();
	        int a = 0;
	        int b = 0;
	        int[] ns = new int[n];
	        for(int i = 0; i < n; i++) {
	            a = sc.nextInt();
	            b = sc.nextInt();
	            if(a == b) {
	            	ns[i] = a * b;
	            	continue;
	            }
	            ns[i] = a + b;
	        }
	        int ans = 0;
	        for(int num : ns) {
	        	ans += num;
	        }
	        System.out.println(ans);
	    }

}
