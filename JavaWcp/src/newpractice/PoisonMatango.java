package newpractice;

public class PoisonMatango extends Matango{
	int poison = 5;
	
	public void attack(Hero h) {
		super.attack(h);
		if(this.poison >0) {
			System.out.println("さらに独の胞子をばらまいた");
			h.hp -= h.hp/5;
			System.out.println(h.hp/5 + "ポイントのダメージを与えた");
			this.poison-- ;
		}
	}
	
	public PoisonMatango (char suffix) {
		super(suffix);
	}

}
