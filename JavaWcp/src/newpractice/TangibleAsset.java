package newpractice;

public abstract class TangibleAsset extends Asset implements Thing {
	String color;
	double weight;
	
	public TangibleAsset(String name, int price, String color) {
		super(name, price);
		this.color = color;
	}
	
	public String getColor( ) {
		return this.color;
	}
	
	public void setWeight(double weight) {
		this.weight = weight;
	}
	
	public double getWeight() {
		return this.weight;
	}
}
