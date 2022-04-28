package paiza;

import java.util.Scanner;

public class Practice1a {
	public static void main(String[] args)  throws IndexOutOfBoundsException{
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.nextLine();
        String t = sc.nextLine();
        
        char []alphabet = new char[26];
        char c = 'a';
        for (int i = 0; i < 26; i++){
          alphabet[i] = c++;
        }
        for(char b : alphabet) {
        	System.out.print(b);
        }
        
        char[] S = new char[n];
        for(int i = 0; i < n; i++) {
            char a = s.charAt(i);
            System.out.println(a);
            S[i] = a;
            System.out.println(S[i]);
        }
        for(char ch : S) {
        	System.out.println(ch);
        }
        
        char[] T = new char[n];
        for(int i = 0; i < n; i++) {
            char a = t.charAt(i);
            T[i] = a;
        }
	}

}
