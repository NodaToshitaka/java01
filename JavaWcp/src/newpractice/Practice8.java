package newpractice;

public class Practice8 {
	public static void main(String[] args) {
		Cat cat = new Cat();
		cat.Name = "tama";
		cat.Age = 19;
		
		cat.ShowProfile();
		cat.sleep();
		cat.Speak();
		
		Dog2 dog = new Dog2();
		dog.Name = "pochi";
		dog.Age = 15;
		
		dog.ShowProfile();
		dog.run();
		dog.Speak();
		
		Animal[] animals = new Animal[4];
		for(int i = 0; i < 4; i++) {
			if(i % 2 == 0) {
				animals[i] = new Cat();
			} else {
				animals[i] = new Dog2();
			}
		}
		
		for(int i = 0; i < 4; i++) {
			animals[i].Speak();
		}
	}
}
