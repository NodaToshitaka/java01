package paiza;

import java.util.Scanner;

public class Practice3_17 {
	public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = 0;
        int ans = 0;
        
        for(int i = 0; i < n; i++) {
            m = sc.nextInt();
            if(m >= 5) {
                ans += m;
            }
        }
        System.out.println(ans);
    }

}
