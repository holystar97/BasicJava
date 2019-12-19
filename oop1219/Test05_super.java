package oop1219;

class Parent{
	int one;
	int two;
	public Parent() {}
	public Parent(int one, int two) {
		//super(); 생략되어있음 
		this.one = one;
		this.two = two;
	}	
}

class Child extends Parent{
	int three;
	public Child() {
		//super(); 생략되어있음 
	}
	public Child(int a,int b, int c) {
		
		//super.one=a;
		//super.two=b;
		super(a,b);
		this.three=c;
		
	}
}

public class Test05_super {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 부모 super 
		Child child=new Child(10,20,30);
		System.out.println(child.one);
		System.out.println(child.two);
		System.out.println(child.three);
		
		
	}
}
