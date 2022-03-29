package newpractice;

public class Practice5_4 {
	public static double calcTriangleArea(double bottom, double height) {
		double ans = (bottom * height) / 2;
		return ans;
	}
	
	public static double calcCircleArea(double radius) {
		double ans = (radius * radius) * 3.14;
		return ans;
	}
	
	public static void main(String[] args) {
		System.out.println(calcTriangleArea(10.0, 5.0));
		System.out.println(calcCircleArea(5.0));
	}

}
