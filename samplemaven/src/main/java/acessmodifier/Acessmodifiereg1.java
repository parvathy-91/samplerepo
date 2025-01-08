package acessmodifier;

public class Acessmodifiereg1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Acessmodifiereg1 obj=new Acessmodifiereg1();
		obj.display();
		obj.display1();
		obj.display2();
		obj.display3();
	}
public void display()
{
	System.out.println("PUBLIC");
}
private void display1()
{
	System.out.println("PRIVATE");
}
protected void display2()
{
	System.out.println("PROTECTED");
}
 void display3()
{
	System.out.println("DEFAULT");
}
}
