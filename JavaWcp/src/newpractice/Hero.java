package newpractice;

public class Hero {
	String name = "ヒーロー";
	int hp = 100;
	
	public void attack(Matango m) {
		System.out.println(this.name + "の攻撃");
		System.out.println("5ポイントのダメージを与えた");
		m.hp -= 5;
	}
	
	public void run() {
		System.out.println(this.name + "は逃げ出した");
	}

}
