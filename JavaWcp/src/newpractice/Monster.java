package newpractice;

public abstract class Monster {
	int hp;
	char suffix;
	
	public Monster(char suffix) {
		this.suffix = suffix;
	}
	public abstract void attack(Hero h);

}
