package paiza;

import java.util.Scanner;

public class Practice2_8 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] nums = new int[N];
        for(int i = 0; i < N; i++) {
            nums[i] = sc.nextInt();
        }
        
        int C = 0;
        
        for(int n : nums) {
            if(n == 0) {
                C++;
                break;
            }
        }
        
        if(C == 0) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
        
        
    }

}
