package exercise;

public  class Absparent extends Abschild {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Absparent obj=new Absparent();
		obj.sum();
		obj.display();
	}

	@Override
	public void sum() {
		// TODO Auto-generated method stub
		int num1=8;
		int num2=4;
		int sum=num1+num2;
		System.out.println(sum);
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("correct answer");
	}

	
	
	
	
}
