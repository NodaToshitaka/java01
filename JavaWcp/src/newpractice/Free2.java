package newpractice;

public class Free2 {
	public static void main(String[] args) {
		System.out.println("七三分けゲームを始めます");
		System.out.println("数字を入力してください");
		int num1 = new java.util.Scanner(System.in).nextInt();
		
		if (num1 % 21 == 0) {
			System.out.println("七三！");
		} else if(num1 % 7 == 0) {
			System.out.println("三！");
		} else if(num1 % 3 == 0) {
			System.out.println("七！");
		} else {
			System.out.println("坊主！");
		}
		System.out.println("終わり");
	}

}
