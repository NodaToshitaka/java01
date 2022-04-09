package newpractice;

public class Clelic {
	String name;
	
	static final int HP = 50;
	int hp = HP;
	
	static final int MP = 10;
	int mp = MP;
	
	public void selfAid() {
		System.out.println(this.name + "はセルフエイドを唱えた");
		System.out.println("MPを５消費、全回復した");
		this.mp -= 5;
		this.hp = HP;
	}
	
	public int pray(int sec) {
		System.out.println(this.name + "は" + sec + "秒間祈った");
		int mpAid = new java.util.Random().nextInt(3) + sec;
		int returnMp = Math.min(this.MP - this.mp, mpAid);
		System.out.println(returnMp + "ポイントMPが回復した");
		
		return returnMp;
	}

}
