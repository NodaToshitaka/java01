package paiza;

import java.util.Scanner;

public class Practice3_23 {
	 public static void main(String[] args) {
	        // 自分の得意な言語で
	        // Let's チャレンジ！！
	        Scanner sc = new Scanner(System.in);
	        String al ="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	        String a = sc.nextLine();
	        String b = sc.nextLine();
	        String c = sc.nextLine();
	        String ans = al.substring(al.indexOf(a), al.indexOf(b) + 1);
	        if(ans.indexOf(c) == -1) {
	            System.out.println("false");
	        } else {
	            System.out.println("true");
	        }
	        
	    }

}
