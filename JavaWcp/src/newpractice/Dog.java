package newpractice;

public class Dog {
	private String Name;
	private int Age;
	private String bod;

    public void SetName( String nm )
    {
        Name = nm;
    }

	public void setAge(int age) {
		Age = age;
	}

	public void ShowProfile()
    {
        System.out.println( "名前は、" + Name + "年齢は" + Age + "犬種は" + bod +  "です。" );
    }
	
	public Dog(String bod) {
		this.bod = bod;
	}

}
