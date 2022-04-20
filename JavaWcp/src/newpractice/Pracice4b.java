package newpractice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Pracice4b {
	public static void main(String[] args) throws IOException {
		int a = 1;
		int ans;
		for(int i = 1; i <= 90; i++) {
			if( i % 10 == 0) {
				a++;
				System.out.println("");
				continue;
			}
			ans = a * (i % 10);
			System.out.printf(" %2d", ans );
		}
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		ans = 0;
		while( a != 0) {
			a = Integer.parseInt(br.readLine());
			ans += a;
		}
		System.out.println( ans );
		
		int count = -1;
		ans = 0;
		do {
			ans += a;
			count++;
			a = Integer.parseInt(br.readLine());
		} while( a != 0);
		System.out.println( (double)ans / count );
		
		a = Integer.parseInt(br.readLine());
		for(int i = 0; i < a; i++) {
			for(int n = 0; n <= i; n++) {
				System.out.print("$");
			}
			System.out.println("");
		}
		
		a = Integer.parseInt(br.readLine());
		for(int i = 0; i < a; i++) {
			for(int n = 0; n < a; n++) {
				if(i == n || (a -i -1) == n) {
					System.out.print("$");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println("");
		}
	}

}
