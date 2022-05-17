package paiza;

import java.util.Arrays;
import java.util.Scanner;

public class Practice3_9 {
   public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.nextLine();
        
        String[] ss = new String[N];
        for(int i = 0; i < N; i++) {
            ss[i] = sc.nextLine();
        }
        
        Arrays.sort(ss);
        
        int count = 0;
        int num = 0;
        for(int i = 0; i < N; i++) {
            if(i == N - 1) {
                if(ss[num].equals(ss[i])) {
                	count++;
                	System.out.println( ss[num] + " " + count);
                } else {
                	System.out.println( ss[num] + " " + count);
                	count = 1;
                	System.out.println( ss[i] + " " + count);
                }
            } else {
            	if(ss[num].equals(ss[i])) {
                	count++;
                } else {
                	System.out.println( ss[num] + " " + count);
                	num = i;
                	count = 1;
                	
                }
            }
            
        }
        
    }

}
