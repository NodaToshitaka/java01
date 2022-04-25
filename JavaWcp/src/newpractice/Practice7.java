package newpractice;

import java.io.IOException;

public class Practice7 {
	public static void main(String[] args) throws IOException {
		Dog dog = new Dog("shiba");
		dog.SetName("pochi");
		dog.setAge(12);
		dog.ShowProfile();
		
		Dog dog2 = new Dog("akita");
		dog2.SetName("hachi");
		dog2.setAge(99);
		dog2.ShowProfile();
		
		Coin coin = new Coin();
		coin.AddCoin(10, 5);
		coin.AddCoin(100, 3);
		coin.AddCoin(5, 50);
		coin.AddCoin(500, 1);
		coin.AddCoin(50, 5);
		
		System.out.println(coin.GetAmount());
		System.out.println(coin.GetCount());
		
		System.out.println(coin.GetCount(500));
		System.out.println(coin.GetCount(10));
		
		
		System.out.println(coin.GetAmount(5));
		System.out.println(coin.GetAmount(50));
		
	}

}
