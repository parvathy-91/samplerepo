package abstraction;

public class Abstractionchild extends Abstractionparent{

	public static void main(String[] args) {
		Abstractionchild obj=new Abstractionchild();
				obj.sum();
				obj.display();
	}

	@Override
	public void sum() 
	{
		int num1=5;
		int num2=10;
		int sum=num1+num2;
		System.out.println("SUM IS:"+sum);
	}

	@Override
	public void display() {
		System.out.println("HELLO");
		
	}

}
