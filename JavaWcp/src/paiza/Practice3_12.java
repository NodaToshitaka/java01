package paiza;

import java.util.Scanner;

public class Practice3_12 {
	public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int b = sc.nextInt();
        int[] ns = new int[n];
        for(int i = 0; i < n; i++) {
            ns[i] = sc.nextInt();
        }
        for(int i = 0; i < n; i++) {
            if(b == ns[i]) {
                System.out.println("Yes");
                break;
            } else {
                if(i == n - 1) {
                    System.out.println("No");
                }
            }
        }
        
    }

}
