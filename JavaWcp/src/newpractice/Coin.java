package newpractice;

public class Coin {
	private int coin1;
	private int coin5;
	private int coin10;
	private int coin50;
	private int coin100;
	private int coin500;
	
	public void AddCoin(int coin, int num) {
		if(coin == 1) {
			coin1 += num;
		} else if(coin == 5) {
			coin5 += num;
		} else if(coin == 10) {
			coin10 += num;
		} else if(coin == 50) {
			coin50 += num;
		} else if(coin == 100) {
			coin100 += num;
		} else if(coin == 500) {
			coin500 += num;
		} else {
			System.out.println("miss");
		}
	}
	
	public int GetCount(int coin) {
		if(coin == 1) {
			return coin1;
		} else if(coin == 5) {
			return coin5;
		} else if(coin == 10) {
			return coin10;
		} else if(coin == 50) {
			return coin50;
		} else if(coin == 100) {
			 return coin100;
		} else if(coin == 500) {
			return coin500;
		} else {
			return 0;
		}
	}
	
	public int GetCount() {
		return coin1 + coin5 + coin10 + coin50 + coin100 + coin500;
	}
	
	public int GetAmount(int coin) {
		if(coin == 1) {
			return coin1;
		} else if(coin == 5) {
			return coin5 * 5;
		} else if(coin == 10) {
			return coin10 * 10;
		} else if(coin == 50) {
			return coin50 * 50;
		} else if(coin == 100) {
			 return coin100 * 100;
		} else if(coin == 500) {
			return coin500 * 500;
		} else {
			return 0;
		}
	}
	
	public int GetAmount() {
		return coin1 + (coin5 * 5) + (coin10 * 10) + (coin50 * 50) + (coin100 * 100) + (coin500 * 500);
	}
	
	

}
