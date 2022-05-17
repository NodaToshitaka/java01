package paiza;

import java.util.Scanner;

public class Practice3_8 {
	 public static void main(String[] args) {
	        
	        Scanner sc = new Scanner(System.in);
	        int n = sc.nextInt();
	        sc.nextLine();
	        String line = sc.nextLine();
	        
	        char[] alf = new char[26];
	        char c = 'a';
	        for(int i = 0; i < 26; i++) {
	            alf[i] = c++;
	        }
	        int count = 0;
	        for(int i = 0; i < 26; i++) {
	            for(int j = 0; j < n; j++) {
	                if(line.charAt(j) == alf[i] ) {
	                    count++;
	                }
	            }
	            if(i == 25) {
	                System.out.print(count);
	                break;
	            }
	            System.out.print(count + " ");
	            count = 0;
	        }
	        
	    }

}
