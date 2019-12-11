package oop1210;

public class Test05_conversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//자료형 변환 
		//1 ) 자동형 변환
		// byte < short < int < long 
		// float < double 
		
		byte a=3;
		int b=a;
		System.out.println(a);
		System.out.println(b);
	
		long c=5;
		//int d=c; 에러. 큰 자료형이 작은 자료형에 대입할 수 없다. 
		
		float e=1.2f;
		double f=e; //자동형 변환
		
		//2) 강제형 변환 (cast연산자)
		//필요한 곳에 일시적으로 변환
		// ->(자료형)값 
		System.out.println((int)3.5);
		System.out.println((double)4);
		System.out.println((int)2.6+(int)5.7);
		System.out.println((int)(2.6+5.7));
		
		
		
		//int 형과  char 형도 서로 형변환이 가능하다 
		System.out.println(65);
		System.out.println((char)65);
		System.out.println((char)66);
		System.out.println((char)67);
		
		System.out.println('a');
		System.out.println((int)'a');
		System.out.println((int)'b');
		System.out.println((int)'c');
		
		//대문자 A보다는 소문자 a가 더 크다 
		
		System.out.println((int)'+');
		System.out.println((int)' ');
		System.out.println((int)'\r');
		
		System.out.println("#" +(char)('a'-'A')+"#"); // 97-65
		
		// 대문자 소문자 차이는 32이다 -> 문자로는 공백 
		
		
		
		
		
		
		
	}

}
