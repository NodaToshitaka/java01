package paiza;

import java.util.Scanner;

public class Practice3_19 {
	public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        char c = sc.next().charAt(0);
        String line = sc.next();
        char[] ss = new char[line.length()];
        for(int i = 0; i < line.length(); i++) {
            ss[i] = line.charAt(i);
        }
        
        int count = 0;
        for(int i = 0; i < line.length(); i++) {
            if(c == ss[i]) {
                count++;
            }
        }
        System.out.println(count);
    }

}
