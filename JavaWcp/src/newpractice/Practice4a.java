package newpractice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Practice4a {
	public static void main(String[] args) throws IOException{
		int x = 0;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int y = 0;
		do {
			y = Integer.parseInt(br.readLine());
			x += y;
		} while(x < 100);
		System.out.println(x);
		
		int ball = 0;
		int in = 0;
		int out = 0;
		while(out < 4) {
			System.out.println("ストライク=1 or ボール=2 ファウル=3 ？");
			ball = Integer.parseInt(br.readLine());
			if(ball == 1) {
				in++;
			} else if(ball == 3 && in < 2) {
				in++;
			} else if(ball == 2){
				out++;
			}
			System.out.println("s" + in + "b" + out);
			if(in >= 3) {
				break;
			}
		}
		
		System.out.println("数を入力");
		int a = Integer.parseInt(br.readLine());
		int i;
		for(i = 2; i <= (a / 2 ); i++) {
			if(a % i == 0) {
				break;
			}
		}
		if(i > (a / 2)) {
			System.out.println( a + "は素数です" );
		} else {
			System.out.println( a + "は素数ではありません" );
		}
		
		a = Integer.parseInt(br.readLine());
		for(int n = 2; a > 1; n++) {
			while(a % n == 0) {
				System.out.print( n + " " );
				a = a / n;
			}
		}
	}

}
