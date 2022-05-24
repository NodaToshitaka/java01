package paiza;

import java.util.Scanner;

public class Practice3_15 {
  public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] ns = new long[n];
        for(int i = 0; i < n; i++) {
            ns[i] = sc.nextLong();
        }
        String[] ss = new String[n - 1];
        for(int i = 1; i < n; i++) {
            for(int j = 0; j < i; j++) {
                if(ns[i] == ns[j]) {
                    ss[i - 1] = "Yes";
                    break;
                } else {
                    if(j == i - 1) {
                        ss[i - 1] = "No";
                    }
                }
                
            }
        }
        for(String s : ss) {
            System.out.println(s);
        }
    }

}
