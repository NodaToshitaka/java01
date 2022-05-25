package paiza;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class Practice3_16 {
  public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        ArrayList<Integer> ns = new ArrayList<>();
        
        for(int i = 0; i < N * 2; i++) {
            ns.add(sc.nextInt());
        }
        Collections.sort(ns);
        ArrayList<Integer> ms = new ArrayList<>(new LinkedHashSet<>(ns));
        
        for(int i = 0; i < ms.size(); i++) {
            if(i == ms.size() - 1) {
                System.out.println(ms.get(i));
                break;
            }
            System.out.print(ms.get(i) + " ");
        }
        
    }

}
