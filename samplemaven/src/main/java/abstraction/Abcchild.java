package abstraction;

public  class Abcchild extends Abc{

	public static void main(String[] args) {
		Abcchild obj=new Abcchild();
		obj.mul();
	}

@Override
public void mul() {
	int num1=3;
	int num2=6;
int c=num1+num2;
System.out.println(c);
	
}
@Override
public void sub() {
	// TODO Auto-generated method stub
	
}
}
