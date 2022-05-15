package paiza;

import java.util.Scanner;

public class Practice3_7 {
	 public static void main(String[] args) {
	        
	        Scanner sc = new Scanner(System.in);
	        int N = sc.nextInt();
	        int[] nums = new int[N];
	        for(int i = 0; i < N; i++) {
	            nums[i] = sc.nextInt();
	        }
	        
	        int num = 0;
	        
	        for(int i = 0; i <10; i++) {
	            
	            for(int j = 0; j < N; j++) {
	                if(nums[j] == i) {
	                    num++;
	                }
	            }
	            if(i == 9) {
	                System.out.println(num);
	                break;
	            }
	            System.out.print(num + " ");
	            num = 0;
	        }
	       
	    }

}
