package paiza;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Practice3_1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		
		List<Integer> nums = new ArrayList<>();
		
		for(int i = 0; i < N; i++) {
            nums.add(sc.nextInt());
        }
		
		System.out.println(nums.get(M - 1));
	}

}
