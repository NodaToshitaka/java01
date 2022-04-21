package newpractice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Practice5 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("十個の数字を入れてください");
		int[] numbers = new int[10];
		for(int i = 0; i < 10; i++) {
			numbers[i] = Integer.parseInt(br.readLine());
		}
		
		for(int i = 0; i < 10; i++) {
			System.out.print(numbers[i] * 2);
		}
		System.out.println("");
		
		for(int i = 0; i < 10; i++) {
			System.out.print(numbers[9 - i]);
		}
		System.out.println("");
		
		System.out.print("偶数：");
		for(int i = 0; i < 10; i++) {
			if(i % 2 == 0) {
				System.out.print(numbers[i]);
			}
		}
		System.out.println("");
		
		System.out.print("奇数：");
		for(int i = 0; i < 10; i++) {
			if(i % 2 != 0) {
				System.out.print(numbers[i]);
			}
		}
		System.out.println("");
	}

}
