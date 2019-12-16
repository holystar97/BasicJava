package oop1216;

public class Test03_method {

	public static void test1() {
		test1(); //자신의 함수를 호출할 수 있다 
	}
	
	public static long fact(int a) {
		if(a==0) {
			return 1;
		}
		else {
			return a*fact(a-1);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		// 재귀적 함수 호출 
		// 자신이 자신의 함수를 호출할 수 있다 
		System.out.println(fact(3));
	}

}
