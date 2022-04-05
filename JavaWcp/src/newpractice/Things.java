package newpractice;

public class Things {
	public static void main(String[] args) {
		Book b = new Book("bookname",1000,"brack","1-1-1");
		Computer c = new Computer("pcname",25000,"red","app");
		
		b.setWeight(100.15);
		System.out.println(b.getWeight());
		
		System.out.println(c.getName());
		System.out.println(c.getMakerName());
	}

}
