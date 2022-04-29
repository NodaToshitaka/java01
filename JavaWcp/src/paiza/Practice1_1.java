package paiza;

import java.util.Arrays;
import java.util.Scanner;

public class Practice1_1{
	public static void main(String[] args)  throws IndexOutOfBoundsException{
	       
        Scanner sc = new Scanner(System.in);
        int ns = sc.nextInt();
        sc.nextLine();
        String ss = sc.nextLine();
        String ts = sc.nextLine();
        
        int n = ns;
        String s = ss;
        String t = ts;
        
        char []alphabet = new char[26];
        char c = 'a';
        for (int i = 0; i < 26; i++){
          alphabet[i] = c++;
        }
        
        char[] S = new char[n];
        for(int i = 0; i < n; i++) {
            char a = s.charAt(i);
            S[i] = a;
        }
        
        char[] T = new char[n];
        for(int i = 0; i < n; i++) {
            char a = t.charAt(i);
            T[i] = a;
        }
        
        int sa =0;
        int ta = 0;
        int[] rots = new int[n];
        for (int i = 0; i < n; i++){
            for(int j = 0; j <26; j++) {
                if(alphabet[j] == S[i] && alphabet[j] == T[i]) {
                    sa = j;
                    ta = j;
                } else if(alphabet[j] == S[i]) {
                	sa = j;
                } else if(alphabet[j] == T[i]) {
                    ta = j;
                }
               
            }
            rots[i] = ta - sa;
            if(rots[i] < 0) {
            	rots[i] += 26;
            }
        }
        Arrays.sort(rots);
        int pre_mode, num, max_num;
        int mode;
        mode = rots[0];
        max_num = 1;
        pre_mode = rots[0];
        num = 1;
        for(int i =1; i < n; i++) {
            if(pre_mode == rots[i]) {
                num++;
            } else {
                if(num > max_num) {
                    mode = pre_mode;
                    max_num = num;
                }
                pre_mode = rots[i];
                num = 1;
            }
        }
        
        if(num > max_num) {
            mode = pre_mode;
            max_num = num;
        }
        
        
        if(max_num == n) {
            System.out.println("correct rot-" + mode);
        } else if (max_num == n - 1) {
            char[] Td = new char [n];
            for(int i =0; i < n; i++) {
                for(int j =0; j < 26; j++ )  {
                	if(alphabet[j] == S[i]) {
                		int ans;
                		if(j + mode > 25) {
                			ans = j + mode - 26;
                		} else {
                			ans = j + mode ;
                		}
                		Td[i] = alphabet[ans];
                		
                	}
                }
            }
            System.out.print("fixed ");
            for(char td : Td) {
                System.out.print(td);
            }
            System.out.println("");
        } else {
            System.out.println("incorrect");
        }
       
    }

}
