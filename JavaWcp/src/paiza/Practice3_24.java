package paiza;

import java.util.Scanner;

public class Practice3_24 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String result = "D";
        String x = "XXXXX";
        String o = "OOOOO";
        String[][] sss = new String[5][5];
        
        for(int i = 0; i < 5; i++) {
            String line = sc.nextLine();
            
            if(line.equals(x)) {
                result = "X";
            } else if(line.equals(o)) {
                result = "O";
            }
            
            sss[i] = line.split("");
        }
        
        String s1 = "";
        String s2 = "";
        
        for(int i = 0; i < 5; i++) {
            s1 += sss[i][i];
            s2 += sss[i][4 - i];
        }
        
        if(s1.equals(x) || s2.equals(x)) {
            result = "X";
        } else if(s1.equals(o) || s2.equals(o)) {
            result = "O";
        }
        
        for(int i = 0; i < 5; i++) {
            String s = "";
            
            for(int j = 0; j < 5; j++) {
                s += sss[j][i];
            }
            
            if(s.equals(x)) {
                result = "X";
            } else if(s.equals(o)) {
                result = "O";
            }
        }
        System.out.println(result);
    }

}
