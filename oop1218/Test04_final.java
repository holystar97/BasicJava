package oop1218;

/*
class Animal{}

final class Elephant extends Animal{
	
}*/

class Fruit{
	
	void view() {}
	final void disp() {}
}


class Apple extends Fruit{
	@Override
	void view() {
		// TODO Auto-generated method stub
		super.view();
	}
	
	
}


public class Test04_final {

	public static void main(String[] args) {

		// TODO Auto-generated method stub

		int a=3;
		a=5;// 다른값으로 대입 가능 
		
		final int b=4;
		//b=6;
		
		
		
		
		
	}

}
