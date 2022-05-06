package paiza;

import java.util.Scanner;

public class Practice2_6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int H = sc.nextInt();
		int W = sc.nextInt();
		
		if(H == 0 || W == 0) {
			System.out.println("NO");
		} else if(H % 2 == 0 && W % 2 == 0) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
		
	}

}
