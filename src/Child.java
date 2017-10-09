
public class Child extends ThisKeyword
{
	int rno;
	String name;
	public Child()
	{
		super(1000,"XYZ");
		this.rno=super.rno;
		this.name=name;
		System.out.println("HEllo from parend class");
	}
	public void print()
	{
		System.out.println("Child class");
		super.print();
	}
	public static void main(String[] args) 
	{
		Child ch=new Child();
		ch.print();

	}

}
