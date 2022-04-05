package newpractice;

public class Computer extends TangibleAsset {
	String makerName;
	
	public Computer(String name, int price, String color, String isbn) {
		super(name, price, color);
		this.makerName = isbn;
	}
	
	public String getMakerName() {
		return this.makerName;
	}

}
