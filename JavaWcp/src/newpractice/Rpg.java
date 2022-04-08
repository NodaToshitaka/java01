package newpractice;

public class Rpg {
	public static void main(String[] args) {
		Clelic clelic = new Clelic();
		clelic.name = "ヒーラー";
		
		Thief thief = new Thief("トリックスター");
		System.out.println(thief.name);
		
		Hero hero = new Hero();
		PoisonMatango p = new PoisonMatango('A');
		
		p.attack(hero);
		hero.run();
		
		Wizard wizard = new Wizard();
		Wand wand = new Wand();
		wand.setName("仕込み杖");
		wand.setPower(10.0);
		wizard.setName("ウィザード");
		wizard.setWand(wand);
		
		wizard.heal(hero);
	}
	

}
