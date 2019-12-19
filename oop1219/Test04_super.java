package oop1219;

class School{
	String name="학교";
	public School() {
		System.out.println("School()....");
	}
}

class MiddleSchool extends School{
	
	String name="중학교";
	
	public MiddleSchool() {
		super();
		System.out.println("MiddleSchool()....");
	}
	
}

class HighSchool extends School{
	
	String name="고등학교";
	public HighSchool() {
		super();
		System.out.println("HighSchool()....");
	}
	
	public void disp() {
		String name="종로고등학교";
		System.out.println(name); // 종로 고등학교
		System.out.println(this.name); //고등학교 
		System.out.println(super.name); // 학교
	}
}



public class Test04_super {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MiddleSchool ms=new MiddleSchool();
		System.out.println(ms.name);
		
		HighSchool hs=new HighSchool();
		hs.disp();	
		
	}
}
