package paiza;

import java.util.Scanner;

public class Practice2_9 {
public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();
        
        if(z >= 10) {
            System.out.println("YES");
        } else if(x >= 10 && y >= 10) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
       
    }

}
