package paiza;

import java.util.Scanner;

public class Practice3_6 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int H = sc.nextInt();
        int W = sc.nextInt();
        int r = sc.nextInt();
        int c = sc.nextInt();
        sc.nextLine();
        
        String[] nums = new String[H];
        for(int i = 0; i < H; i++) {
            nums[i] = sc.nextLine();
            System.out.println(nums[i]);
        }
        
        for(String s : nums) {
        	System.out.println(s);
        }
        System.out.println(r - 1);
        System.out.println(c - 1);
        
        char aim = nums[r - 1].charAt(c - 1);
        
        if(aim == '#') {
           System.out.println("YES"); 
        } else {
            System.out.println("NO");
        }
        
    }
	

}
