package paiza;

import java.util.Scanner;

public class Practice3_2 {
	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        int N = sc.nextInt();
	        int[] ns = new int[N];
	        for(int i = 0; i < N; i++) {
	            ns[i] = sc.nextInt();
	        }
	        
	        int Q = sc.nextInt();
	        int[] qs = new int[Q];
	        for(int i = 0; i < Q; i++) {
	            qs[i] = sc.nextInt();
	        }
	        
	        for(int num : qs) {
	            System.out.println(ns[num - 1]);
	        }
	        
	    }

}
