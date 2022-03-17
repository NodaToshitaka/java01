public class Chapter08 {
    public static void main(String[] args) {
      int num1 = 1;
      while (num1 < 5) {
        System.out.println(num1 * num1);
        num1++;
      }
      
      int[] array = {5, 10, 15, 20};
      for (int num2 = 0; num2 < array.length; num2++) {
        System.out.println(array[num2]);
      }
    

      for (int num3 : array) {
          if (num3 % 2 == 0) {
            continue;
          }
          System.out.println(num3);
      }
    }
}