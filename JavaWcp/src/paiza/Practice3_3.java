package paiza;

import java.util.Scanner;

public class Practice3_3 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int min = A;
        int max = A;
        
        if(min > B) {
            min = B;
        }
        if(min > C) {
            min = C;
        }
        
        if(max < B) {
            max = B;
        }
        if(max < C) {
            max = C;
        }
        
        System.out.println(max - min);
    }

}
