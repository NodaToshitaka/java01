package newpractice;

public class Wizard {
	private int hp;
	private int mp;
	private String name;
	private Wand wand;
	
	
	public int getHp() {
		return this.hp;
	}
	public void setHp(int hp) {
		if(hp < 0) {
			this.hp = 0;
		}
		this.hp = hp;
	}
	public int getMp() {
		return this.mp;
	}
	public void setMp(int mp) {
		if(mp < 0) {
			throw new IllegalArgumentException("error");
		}
		this.mp = mp;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Wand getWand() {
		return this.wand;
	}
	public void setWand(Wand wand) {
		if(wand == null) {
			throw new IllegalArgumentException("error");
		}
		this.wand = wand;
	}
	
	void heal(Hero h) {
		int basePoint = 10;
		int recoverPoint = (int)(basePoint + wand.getPower());
		h.setHp(h.getHp() + recoverPoint);
		System.out.println(h.getName() + "のHPを" + recoverPoint + "回復させた");
	}
	
    
	

}
