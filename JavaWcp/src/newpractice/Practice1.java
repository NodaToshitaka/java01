package newpractice;

public class Practice1 {
	public static void main(String[] args) {
		System.out.println("Hello World");
		
		int x = 11;
		System.out.println("x=" + x);
		
		x = 13;
		int y = 17;
		System.out.println("x=" + x  + ",y=" + y);
		
		x = 13 + 17;
		System.out.println("x=" + x);
		
		System.out.println(13 * 17);
		
		x = 7;
		x *= 3;
		System.out.println("x=" + x);
		x /= 2;
		System.out.println("x=" + x);
		
		x = 3;
		y = 7;
		int z = y;
		y = x;
		x = z;
		System.out.println("x=" + x  + ",y=" + y);
		
		x = 19;
		y = 23;
		z = x * y;
		System.out.println("z=" + z);
		
		x = 2;
		for(int i = 2; i < 5; i++) {
			x = x * i;
		}
		System.out.println("x=" + x);
		
		x = 2;
		for(int i = 1; i < 4; i++) {
			x = x * x;
		}
		System.out.println("x=" + x);
		
		x = 100;
		y = x / 7;
		z = x % 7;
		System.out.println("y=" + y);
		System.out.println("z=" + z);
		
		x = 49;
		x++;
		System.out.println("x=" + x);
		x--;
		x--;
		System.out.println("x=" + x);
	}

}
