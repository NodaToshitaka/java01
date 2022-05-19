package paiza;

import java.util.Scanner;

public class Practice3_10 {
public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        
        int[] nsn = new int[N];
        String[] ns = new String[N];
        for(int i = 0; i < N; i++) {
            ns[i] = sc.next();
            nsn[i] = sc.nextInt();
            
        }
        
        
        String[] ms = new String[M];
        for(int i = 0; i < M; i++) {
            ms[i] = sc.next();
        }
        
        int count = 0;
        for(int i = 0; i < M; i++) {
            for(int j = 0; j < N; j++) {
                if(ms[i].equals(ns[j])) {
                    System.out.println(nsn[j]);
                } else {
                    count++;
                    if(count == N) {
                        System.out.println(-1);
                    }
                }
            }
            count = 0;
        }
        
    }

}
