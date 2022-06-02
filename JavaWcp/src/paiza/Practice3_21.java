package paiza;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Practice3_21 {
	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        int n = sc.nextInt();
	        Map<Integer, String> ps = new TreeMap<>();
	        for(int i = 0; i < n; i++) {
	            String s = sc.next();
	            int num = sc.nextInt();
	            ps.put(num, s);
	        }
	        
	        for(int key : ps.keySet()) {
	            String val = ps.get(key);
	            System.out.println(val);
	        }
	        
	    }

}
