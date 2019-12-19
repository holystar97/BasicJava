package oop1219;


// 종단 클래스는 상속 시킬 수 없다 
//final class AA{	}

class AA{
	
	private void zero() {}
	public void one() {
		System.out.println("AA.one()...");
	}
	public void two(){
		System.out.println("AA.two()...");
	}
}
class BB extends AA{
	//부모 클래스 AA
	//자식 클래스 BB
	
	public void three() {
		System.out.println("BB.three()...");
	}
}

class CC extends BB{
	public void four() {
		System.out.println("CC.four()...");
	}
}


class DD {}


//class EE extends AA,DD{}



public class Test02_Sangsok {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AA aa= new AA();
		aa.one();
		aa.two();
		
		BB bb=new BB();
		bb.three();
		bb.one();
		bb.two();
		//bb.zero();  private 속성은 상속되지 않느다 
		
		CC cc=new CC();
		cc.four();
		cc.three();
		cc.one();
		cc.two();
		
		
		
	}

}
