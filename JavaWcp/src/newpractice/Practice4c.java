package newpractice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Practice4c {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int a = Integer.parseInt(br.readLine());
		for(int i = 1; i <= a; i++) {
			for(int n = 1; n <= a; n++) {
				if(i == n || (a -i + 1) == n) {
					System.out.print("$");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println("");
		}
		
		int x = 0;
		int y = 1;
		System.out.print(x + ",");
		System.out.print(y + ",");
		while(x < 1000 || y < 1000) {
			x += y;
			if(x > 1000) {
				break;
			}
			System.out.print(x + ",");
			y += x;
			if(y > 1000) {
				break;
			}
			System.out.print(y + ",");
		}
	}

}
