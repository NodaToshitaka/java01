package newpractice;

public class Hero {
	private String name = "ヒーロー";
	private int hp = 100;
	
	public int getHp() {
		return this.hp;
	}
	public void setHp(int hp) {
		this.hp = hp;
	}
	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public void attack(Matango m) {
		System.out.println(this.name + "の攻撃");
		System.out.println("5ポイントのダメージを与えた");
		m.hp -= 5;
	}
	
	public void run() {
		System.out.println(this.name + "は逃げ出した");
	}

}
