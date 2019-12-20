package oop1220;


abstract class Animal{
	String name;
	void view() {} // 일반 메소드
	abstract void disp(); // 추상 메소드
}


class Elephant extends Animal{
	@Override
	void disp() {
		// TODO Auto-generated method stub
		System.out.println("점보");
	}
}

class Tuna extends Animal{
	@Override
	void disp() {
		// TODO Auto-generated method stub
		System.out.println("니모");
	}
}

public class Test02_abstract {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Animal ani= new Animal();
		
		Elephant jumbo=new Elephant();
		jumbo.disp();
		
		Tuna nemo=new Tuna();
		nemo.disp();
		
		Animal ani=new Elephant();
		ani.disp();
		ani=new Tuna();
		ani.disp();
		
		
		
	}

}
