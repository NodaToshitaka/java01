package newpractice;

public class Abc {
	public static void main(String[] args) {
		Y[] y = new Y[2];
		y[0] = new A();
		y[1] = new B();
		
		for(Y yy : y) {
			yy.b();
		}
	}

}