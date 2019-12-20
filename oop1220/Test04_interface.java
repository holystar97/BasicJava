package oop1220;


interface Parent{
//	void disp() {} // 일반 메소드 
	
	abstract void kind();
	void breathe();
	
} // interface end

// 클래스의 부모가 클래스
// 클래스의 부모가 
class Child1 implements Parent{
	@Override
	public void breathe() {
		// TODO Auto-generated method stub
		System.out.println("허파 숨쉬기");
	}@Override
	public void kind() {
		// TODO Auto-generated method stub
		System.out.println("포유류");
	}
}

class Child2 implements Parent{
	@Override
	public void breathe() {
		// TODO Auto-generated method stub
		System.out.println("아가미 숨쉬기");
	}@Override
	public void kind() {
		// TODO Auto-generated method stub
		System.out.println("어류");
	}
	
}



public class Test04_interface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Parent parent =new Parent();
	
		Child1 one=new Child1();
		one.kind();
		one.breathe();
		
		Child2 two=new Child2();
		two.kind();
		two.breathe();
		
		Parent parent=new Child1();
		parent.kind();
		parent.breathe();
		
		parent=new Child2();
		parent.breathe();
		parent.kind();
		
		
		
	
	}
}
