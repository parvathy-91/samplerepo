package Inheritance;

public class Multilevelchild extends MultilevelparentB{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Multilevelchild obj=new Multilevelchild();
		obj.display();
		obj.display1();
		obj.display3();
	}

	public void display3()
	{
		System.out.println("GOODEVE");
	}
}
