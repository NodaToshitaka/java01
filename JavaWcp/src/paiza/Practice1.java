package paiza;

import java.util.Scanner;

public class Practice1 {
	public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int S = sc.nextInt();
        int M = sc.nextInt();
        if(S > M) {
            System.out.println("Tarimasen!");
        } else {
            System.out.println(M - S);
        }
    }

}
