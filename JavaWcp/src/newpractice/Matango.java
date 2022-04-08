package newpractice;

public class Matango extends Monster{
	
	
	public Matango(char suffix) {
		super(suffix);
		this.hp = 50;
	}
	
	public void attack(Hero h) {
		System.out.println("キノコ" + this.suffix + "の攻撃");
		System.out.println("10のダメージ");
		h.setHp(h.getHp() - 10);
	}

}
