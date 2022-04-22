package newpractice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Practice5a {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int total, count;
		int[] numbers = new int[10];
		for(count = 0, total = 0; count < 10 && total < 100; count++) {
			numbers[count] = Integer.parseInt(br.readLine());
			total += numbers[count];
		}
		

		for(int n = 0; n < count; n++) {
			System.out.print("\n" + numbers[n]);
		}
		System.out.println();
		
		int value = Integer.parseInt( br.readLine() );

		int binary[] = new int[16];

		for(int i = 15; i >= 0; i--, value /= 2) {
			binary[i] = value % 2;
		}

		for( int i = 0 ; i < 16 ; i++ ) {
		    System.out.print( binary[i] );
		}
		System.out.println();
		
		int kuku[][] = new int[9][9];

		for( int i = 0 ; i < 9 ; i++ )
		{
		    for( int j = 0 ; j < 9 ; j++ ) {
		       kuku[i][j] = (i + 1) * (j + 1);
		    }
		}

		for( int i = 0 ; i < 9 ; i++ )
		{
		    for( int j = 0 ; j < 9 ; j++ ) {
		        System.out.printf( " %2d", kuku[i][j] );
		    }
		    System.out.println();
		}
		
		for(int i = 0; i < 10; i++) {
			numbers[i] = Integer.parseInt(br.readLine());
		}
		Arrays.sort(numbers);
		for(int i = 0; i < 10; i++) {
			System.out.print(numbers[i]);
		}
	}

}
