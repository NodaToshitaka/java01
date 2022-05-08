package paiza;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Practice3 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int Q = sc.nextInt();
        
        List<Integer> nums = new ArrayList<>();
        
        for(int i = 0; i < N; i++) {
            int n = sc.nextInt();
            nums.add(n);
        }
        
        for(int i = 0; i < Q; i++) {
            int n = sc.nextInt();
            if(n == 0) {
                int n2 = sc.nextInt();
                nums.add(n2);
            } else if(n == 1) {
                nums.remove(nums.size() - 1);
            } else if(n == 2) {
                for(int j = 0; j < nums.size(); j++) {
                    System.out.print(nums.get(j));
                    if(j == nums.size() - 1) {
                        break;
                    }
                    System.out.print(" ");
                }
                System.out.println("");
            }
        }
        
    }

}
