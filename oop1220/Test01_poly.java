package oop1220;

class Father extends Object{
	public String name="아버지";
	public String addr="주소";
	public Father() {}
	public Father(String name, String addr) {
		this.name=name;
		this.addr=addr;
	}
	
	public void disp() {
		System.out.println(this.name);
		System.out.println(this.addr);
	}
}

class Son extends Father{
	
	public Son() {}
	public Son(String n,String a) {
		super.name=n;
		super.addr=a;
		
	}
}

class Daugther extends Father{
	String friend="절친";
	public Daugther() {}
	public Daugther(String n, String a) {
		super(n,a);
	
	}	
}

public class Test01_poly {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		Father fa=new Father();
		fa.disp();
		
		Son son=new Son("김옥돌","프랑스");
		son.disp();
		
		Daugther dau=new Daugther("다옥돌","한국");
		dau.disp();
	
		*/
		/*
		Father fa=new Son("개나리","관철동");
		fa.disp();
		
		fa=new Daugther("진달래","인사동");
		fa.disp();
		
//		System.out.println(fa.friend);
		*/
		/*
		Father father=new Father();
		Son son=new Son();
		
		father=son;
		son=(Son)father;
		*/
		
		
		Object obj= new Integer(3);
		
		System.out.println(obj.toString());
		
		obj=new Father();
		System.out.println(obj.toString());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
