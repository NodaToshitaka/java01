package newpractice;

public class PoisonMatango extends Matango{
	int poison = 5;
	
	public void attack(Hero h) {
		super.attack(h);
		if(this.poison >0) {
			System.out.println("さらに独の胞子をばらまいた");
			h.setHp(h.getHp() - h.getHp()/5);;
			System.out.println(h.getHp()/5 + "ポイントのダメージを与えた");
			this.poison-- ;
		}
	}
	
	public PoisonMatango (char suffix) {
		super(suffix);
	}

}
