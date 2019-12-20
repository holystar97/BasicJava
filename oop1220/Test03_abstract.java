package oop1220;

abstract class Travel{
	void view() {}; // 일반 메소드 
	abstract String travelWhere(); // 추상 메소드 
}

class TypeA extends Travel {
	
	@Override
	String travelWhere() {
		// TODO Auto-generated method stub
		return "제주도 올레길";
	}
}

class TypeB extends Travel {
	@Override
	String travelWhere() {
		// TODO Auto-generated method stub
		return "여의도 불꽃축제";
	}
}

class TypeC extends Travel {
	@Override
	String travelWhere() {
		// TODO Auto-generated method stub
		return "지리산 둘레길";
	}
}


public class Test03_abstract {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//추상 클래스와 다형성
		
//		Travel tour=new Travel();
		
		Travel tour=new TypeA();
		System.out.println(tour.travelWhere());
		
		tour=new TypeB();
		System.out.println(tour.travelWhere());
		
		tour=new TypeC();
		System.out.println(tour.travelWhere());
		
		
	}

}
