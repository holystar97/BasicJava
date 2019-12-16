package oop1216;

public class Test02_method {

	
	public static int test1(int a,int b) {
		
		int sum=a+b;
		return sum;
	}
	
	
	public static String test2(int a) {
		if(a%2==0) {
			return "짝수";
		}
		else {
			return "홀수";
		}
		
	}
	
	public static boolean leap(int a) {
		
		if(a%4==0 && a%100!=0 || a%400==0) {
			return true;
		}
		else {
			return false;
		}
		
		
	}
	
	public static long fact(int n) {
		
		if(n==1) {
			return n;
		}
		else {
			return n*fact(n-1);
			
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//3) 리턴값이 있는 경우 
		
		int result=test1(3,5); // 리턴값은 1개 값만 리턴한다
				// 리턴 값의 자료형을 void 자리에 쓴다 
		System.out.println(result);
		System.out.println(test1(2,4));
		
		String str=test2(7);
		System.out.println(str);
		System.out.println(test2(8));
		
		
		if(leap(2020)) {
			System.out.println("윤년");
		}else {
			System.out.println("평년");
		}
		
		long gop=fact(4);
		System.out.println(gop);
		
		
		
		
		
	}

}
