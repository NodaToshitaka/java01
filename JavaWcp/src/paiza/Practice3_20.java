package paiza;

import java.util.Scanner;

public class Practice3_20 {
	 public static void main(String[] args) {
	        
	        Scanner sc = new Scanner(System.in);
	        String t = sc.nextLine();
	        String s = sc.nextLine();
	        int i = -1;
	        int c = 0;
	        while ((i = s.indexOf(t, i + 1))!=-1) {
	            c++;
	        }
	        System.out.println(c);
	    }

}
