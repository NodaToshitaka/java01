package newpractice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Practice2 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		System.out.println("[" + s + "]");
		
		System.out.println("int");
		int x = Integer.parseInt(br.readLine());
		System.out.println("[" + x + "]");
		
		int bottom = x;
		int index = 3;
		int result = 1;
		for(int i = 1; i <= index; i++) {
			result *= bottom;
			System.out.println("[" + result + "]");
		}
		
		System.out.println("int2");
		x = Integer.parseInt(br.readLine());
		int y = Integer.parseInt(br.readLine());
		System.out.println("[" + (x + y) + "]");
		System.out.println("[" + (x - y) + "]");
		System.out.println("[" + (x * y) + "]");
		System.out.println("[" + (x / y) + "]");
		System.out.println("[" + (x % y) + "]");
		
		System.out.println("あなたの年齢は？");
		x = Integer.parseInt(br.readLine());
		System.out.println("あなたが生まれてから約" + (x * 365) + "日が経過しています");
	}

}
