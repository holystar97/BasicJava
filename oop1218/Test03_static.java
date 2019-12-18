package oop1218;

 class Sawon{
	 String sabun; // 사원번호 
	 String name;   //  이름
	 int pay;	  // 급여 
	public Sawon() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Sawon(String sabun, String name, int pay) {
		super();
		this.sabun = sabun;
		this.name = name;
		this.pay = pay;
	}
	 
	//static 변수 
	static String COMPANY="(주)옥돌나라";
	static int SUDANG=10;
	static double TAX=0.03;
	
	static void line() {
		System.out.println("----------------------");		
	}	 
 }
 
 
public class Test03_static {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(Sawon.COMPANY);
		System.out.println(Sawon.SUDANG);
		System.out.println(Sawon.TAX);
		Sawon.line();
		
		System.out.println(Math.E);
		System.out.println(Math.PI);
		System.out.println(Math.abs(-3));
		
		//static 의 특징을 적용하지 않은경우 
		/*
		Sawon one= new Sawon("1001","나옥돌",100);
		
		// 세금 계산 
		double myTax=one.pay*one.TAX;
		// 나의 총지급액 : 급여 - 세금 + 수당 
		int total=(int)(one.pay-myTax+one.SUDANG);
		
		System.out.println("회사 : "+ one.COMPANY);
		System.out.println("사번: " + one.sabun );
		System.out.println("이름 : " + one.name);
		System.out.println("총지급액 : "+ total);
		*/
		
		//static의 특징을 적용한 경우 
		/*
	Sawon one= new Sawon("1002","다옥돌",200);
		
		// 세금 계산 
		double myTax=one.pay*Sawon.TAX;
		// 나의 총지급액 : 급여 - 세금 + 수당 
		int total=(int)(one.pay-myTax+Sawon.SUDANG);
		
		System.out.println("회사 : "+ Sawon.COMPANY);
		System.out.println("사번: " + one.sabun);
		System.out.println("이름 : " + one.name);
		System.out.println("총지급액 : "+ total);
		Sawon.line();
		
		*/
		
		//static 변수의 연산 
		//static 변수는 생성도 1번, 소멸도 1번 
		Sawon kim=new Sawon("1003","개나리",300);
		Sawon lee=new Sawon("1004","진달래",400);
		
		
		System.out.println(kim.SUDANG); //10 
		System.out.println(lee.SUDANG); //10
	
		kim.SUDANG=kim.SUDANG+1;
		System.out.println(kim.SUDANG);
		
		lee.SUDANG=lee.SUDANG+1;
		System.out.println(lee.SUDANG);
		
		Sawon.SUDANG=Sawon.SUDANG+1; // 12+1
		
		System.out.println(Sawon.SUDANG);
		System.out.println(kim.SUDANG);
		System.out.println(lee.SUDANG);
		
		
		
		
	}
}










