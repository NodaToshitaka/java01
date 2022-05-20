package paiza;

import java.util.Scanner;

public class Practice3_11 {
  public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        
        String[] ns = new String[N];
        for(int i = 0; i < N; i++) {
            ns[i] = sc.next();
            
        }
        
        String[] ms = new String[M];
        for(int i = 0; i < M; i++) {
            ms[i] = sc.next();
        }
        
        for(int i = 0; i < M; i++) {
            for(int j = 0; j < N; j++) {
                if(ms[i].equals(ns[j])) {
                    System.out.println(j + 1);
                    break;
                } else {
                    if(j == N - 1) {
                        System.out.println(-1);
                    }
                }
            }
        }
        
    }

}
