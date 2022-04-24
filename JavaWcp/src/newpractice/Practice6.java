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
		
		triangleC(3, '&');
		triangleC(5, '#');
		triangleC(8, '\\');
		
		for(int i = 0; i < 9; i++) {
			mt(i + 1);
			System.out.println("");
		}
		
		for(int i = 10000; i < 10100; i++) {
		  if(prime(i) == true) {
			  System.out.print(i + " "); 
		  }
		}
		System.out.println("");
		
		
		for(int i = 11; i < 21; i++) {
			System.out.print(fb(i) + " ");
		}
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
	
	public static void triangleC(int x, char ch) {
		for(int i = 0; i < x; i++) {
			for(int n = 0; n <= i; n++) {
				System.out.print(ch);
			}
			System.out.println("");
		}
	}
	
	public static void mt(int x) {
		for(int i = 0; i < 9; i++) {
			System.out.print(x * (i + 1));
		}
	}
	
	public static boolean prime(int x) {
		int num;
		for(num = 2; num <= (x /2); num++) {
			if(x % num == 0) {
				break;
			}
		}
		
		if(num > (x / 2)) {
			return true;
		} else {
			return false;
		}
	}
	
	public static int fb(int x) {
		int num1 = 0;
		int num2 = 1;
		int num3 = num1 + num2;
		int count = 1;
		while(count <= x) {
			if(count == x) {
				break;
			}
			num1 = num2;
			num2 = num3;
			num3 = num1 + num2;
			count++;
		}
		return num1;
	}

}
