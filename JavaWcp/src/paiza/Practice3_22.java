package paiza;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Practice3_22 {
  public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Map<String, Integer> ps = new LinkedHashMap<>();
        for(int i = 0; i < n; i++) {
            String s = sc.next();
            int m = sc.nextInt();
            if(ps.containsKey(s)) {
                ps.put(s, ps.get(s) + m);
            } else {
                ps.put(s, m);
            }
        }
        
        List<Integer> ll = new ArrayList<>(ps.values());
        Collections.sort(ll);
        Collections.reverse(ll);

        for (int v : ll) {
          for (String c : ps.keySet()) {
             if (ps.get(c) == v) {
               System.out.println(c + " " + v);
             }
          }
        }
    }

}
