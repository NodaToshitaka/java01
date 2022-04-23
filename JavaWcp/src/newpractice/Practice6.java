package newpractice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Practice6 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int x = Integer.parseInt(br.readLine());
		System.out.println(square(x));
		
		x = Integer.parseInt(br.readLine());
		int y = Integer.parseInt(br.readLine());
		System.out.println(average(x, y));
		
		x = Integer.parseInt(br.readLine());
		y = Integer.parseInt(br.readLine());
		int z = Integer.parseInt(br.readLine());
		System.out.println(max(max(x, y), z));
		
		x = Integer.parseInt(br.readLine());
		triangle(x);
	}
	
	public static int square(int num) {
		int ans = num * num;
		return ans;
	}
	
	public static int average(int x, int y) {
		int ans = (x + y) / 2;
		return ans;
	}
	
	public static int max(int x, int y) {
		if(x >= y) {
			return x;
		} else {
			return y;
		}
	}
	
	public static void triangle(int x) {
		for(int i = 0; i < x; i++) {
			for(int n = 0; n <= i; n++) {
				System.out.print('$');
			}
			System.out.println("");
		}
	}

}
