package newpractice;

public class Abc {
	public static void main(String[] args) {
		Y[] y = new Y[2];
		y[0] = new A();
		y[1] = new B();
		
		for(Y yy : y) {
			yy.b();
		}
		Account acc = new Account();
		acc.accountNumber ="1456";
		acc.balance = 1000000;
		System.out.println(acc);
	}

}
