package newpractice;

public class Rpg {
	public static void main(String[] args) {
		Clelic clelic = new Clelic();
		clelic.name = "ヒーラー";
		
		Thief thief = new Thief("トリックスター");
		System.out.println(thief.name);
	}

}
