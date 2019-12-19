package oop1219;


class Korea{
	
	String name="대한민국"; 
	
	final void view() {
		System.out.println("Korea.view()...");
	}
	public void disp() {
		System.out.println("Korea.disp()"+ this.name);
	}
}

class Seoul extends Korea{
	String name="서울 특별시 ";//재정의
	//void view() {}
	
	@Override
	public void disp() {
		// TODO Auto-generated method stub
		System.out.println("Seoul.disp()"+ this.name);
	}
}

class Busan extends Korea{
	String name="부산 광역시";
	@Override
	public void disp() {
		// TODO Auto-generated method stub
		System.out.println("Busan disp()..."+ this.name);
	}
}

class Jeju extends Object{

	  @Override
	  public String toString() {
	    return "제주특별자치";
	  }  
	
}

class Suwon{

	private String id ="okdol";
	private String pw="1234";
	@Override
	public String toString() {
		return "Suwon [id=" + id + ", pw=" + pw + "]";
	}	
	
}

public class Test03_override {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//오버라이드 하기 전 
		Seoul se=new Seoul();
		System.out.println(se.name);
		se.view();
		se.disp();
		
		
		Busan bu=new Busan();
		Jeju je=new Jeju();
		
		System.out.println(bu.toString());
		System.out.println(je.toString());
		
		Suwon su=new Suwon();
		System.out.println(su.toString());
		System.out.println(su);
		
		
		
	}

}
