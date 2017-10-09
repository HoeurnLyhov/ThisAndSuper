
public class ThisKeyword {
	int rno;
	String name;
	ThisKeyword(int rno,String name)
	{
		this.rno=rno;
		this.name=name;
		System.out.println("Hello from the another side");
	
	}
	public void print()
	{
		System.out.println(rno);
		System.out.println(name);
	}
	
	public static void main(String[] args) {
		ThisKeyword ca=new ThisKeyword(1000,"ABC");
		ca.print();

	}

}
