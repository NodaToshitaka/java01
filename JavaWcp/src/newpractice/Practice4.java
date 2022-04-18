package newpractice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Practice4 {
	public static void main(String[] args) throws IOException{
		for(int i = 1; i <= 10; i++) {
			System.out.println("SPAM");
		}
		
		for(int i = 1; i <= 9; i++) {
			System.out.println(3 * i);
		}
		
		int a = 1;
		int b = 2;
		for(int i = 1; i <= 8; i++) {
			a *= b;
			System.out.println(a);
		}
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("7の何乗を計算しますか");
		int x = Integer.parseInt(br.readLine());
		a = 1;
		b = 7;
		for(int i =1; i <= x; i++) {
			a *= b;
		}
		System.out.println(a);
		
		System.out.println("十個の数字を入れてください");
		int num1 = Integer.parseInt(br.readLine());
		int num2 = Integer.parseInt(br.readLine());
		int num3 = Integer.parseInt(br.readLine());
		int num4 = Integer.parseInt(br.readLine());
		int num5 = Integer.parseInt(br.readLine());
		int num6 = Integer.parseInt(br.readLine());
		int num7 = Integer.parseInt(br.readLine());
		int num8 = Integer.parseInt(br.readLine());
		int num9 = Integer.parseInt(br.readLine());
		int num10 = Integer.parseInt(br.readLine());
		int[] numbers = {num1,num2,num3,num4,num5,num6,num7,num8,num9,num10};
		int total = 0;
		for(int i =0; i < numbers.length; i++) {
			total += numbers[i];
		}
		System.out.println("平均は" + total / numbers.length);
		
		int ran1 = new java.util.Random().nextInt(2);
		int ran2 = new java.util.Random().nextInt(2);
		int ran3 = new java.util.Random().nextInt(2);
		int ran4 = new java.util.Random().nextInt(2);
		int ran5 = new java.util.Random().nextInt(2);
		int[] rans = {ran1,ran2,ran3,ran4,ran5};
		int win = 0;
		int los = 0;
		for(int i = 0; i < rans.length; i++) {
			if(rans[i] == 0) {
				los++;
			} else {
				win++;
			}
		}
		System.out.println("勝ちは" + win + "負けは" + los);
		
		System.out.println("十個の数字を入れてください");
		num1 = Integer.parseInt(br.readLine());
		num2 = Integer.parseInt(br.readLine());
		num3 = Integer.parseInt(br.readLine());
		num4 = Integer.parseInt(br.readLine());
		num5 = Integer.parseInt(br.readLine());
		num6 = Integer.parseInt(br.readLine());
		num7 = Integer.parseInt(br.readLine());
		num8 = Integer.parseInt(br.readLine());
		num9 = Integer.parseInt(br.readLine());
		num10 = Integer.parseInt(br.readLine());
		int max = numbers[0];
		for(int i = 0; i < numbers.length; i++) {
			if(max < numbers[i]) {
				max = numbers[i];
			}
		}
		System.out.println("最大値は" + max);
		
		System.out.println("十個の数字を入れてください");
		num1 = Integer.parseInt(br.readLine());
		num2 = Integer.parseInt(br.readLine());
		num3 = Integer.parseInt(br.readLine());
		num4 = Integer.parseInt(br.readLine());
		num5 = Integer.parseInt(br.readLine());
		num6 = Integer.parseInt(br.readLine());
		num7 = Integer.parseInt(br.readLine());
		num8 = Integer.parseInt(br.readLine());
		num9 = Integer.parseInt(br.readLine());
		num10 = Integer.parseInt(br.readLine());
		max = numbers[0];
		int min = numbers[0];
		for(int i = 0; i < numbers.length; i++) {
			if(max < numbers[i]) {
				max = numbers[i];
			} else if(min > numbers[i]) {
				min = numbers[i];
			}
		}
		System.out.println("最大値は" + max + "最小値は" + min);
		
		System.out.println("回数を入力");
		int count = Integer.parseInt(br.readLine());
		for(int i = 0; i < count; i++) {
			System.out.print('*');
		}
		
		System.out.println("個数を入力");
		count = Integer.parseInt(br.readLine());
		int ans = 0;
		for(int i = 0; i < count; i++) {
			System.out.print(ans % 10);
			ans++;
		}
	}

}
