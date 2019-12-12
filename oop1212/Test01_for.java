package oop1212;

public class Test01_for {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//1)for
		/*
		 * for(시작값; 종료값; 증감) {
		 * 	 반복 하고자 하는 내용 
		 * }
		 * 
		 * for (;;) {} -> 무한 loop
		 * 
		 * 
		 * 
		 * */
		/*
		for(int a=1; a<3; a=a+1) {
			System.out.println("JAVA");
		}
		//유효범위 
		//->변수 variable, 객체 object가 사용되는 범위 
		//-> 변수 : 지역 변수 local variable 
		//		:전역 변수 global variable
		//System.out.println(a);
		//->for 문안에 선언된 변수는 for 문 안에서 만 유효하다 
		
		
		int b;
		for(b=1 ;b<=5; b=b+2) {
			System.out.println("JEJU");
		}
		*/
		
		/*
		// 감소에 따른 반복 
		for(int c=3; c>=1; c=c-1) {
			System.out.println("KOREA");
		}
		*/
		
		/*
		//구구단 출력 
		
		int dan=4;
		for(int a=1; a<=9; a=a+1) {
			System.out.println(dan+ "*" +a+"="+(dan*a));
		}
		
		//알파벳 대문자 출력 
		
		for(char ch='A'; ch<='Z'; ch++) {
			
			System.out.println(ch);
		}
		
		
		// 문1 ) 1~10 중에서 3의 배수만 출력하기 
		
		for(int i=1; i<=10; i++) {
			
			if(i%3==0) {
				System.out.println(i);
			}
			
		}
		
		
		//문 2) 서기 1년~ 서기 2019년 중에서 윤년만 출력하기
		
		
		for(int i=1 ; i<=2019; i++) {
			
			if(i%4==0 && i%100!=0 || i%400==0) {
				System.out.println(i);
			}
			
		}
		*/
		/*
		//갯수
		//누적 
		//문 3 ) 1~5 중에서 홀수의 갯수를 구하시오 
		int num=0;
		for(int i=1; i<=5; i++) {
			if(i%2==1) {
				num++;
			}
		}
		System.out.println(num);
	
		
		//문 4 ) 1~3 까지 누적의 합을 구하시오 
		
		int sum=0;
		for(int i=1; i<=3; i++) {
			sum+=i;
		}
		System.out.println(sum);
		
		*/
		
		//문 5) 서기 1년~ 서기 2019년 중에서 윤년의 갯수를 구하시오 
		
		int num=0;
		for(int i=1 ; i<=2019; i++) {
			
			if(i%4==0 && i%100!=0 || i%400==0) {
				num++;
			}
		}
		System.out.println(num);
		
		
		
		//문6) 4팩토리얼의 값을 구하시오 
		int i=1;
		int t=1;
		for(int j=4; j>=2; j--) {			
			System.out.print(j +"*");
			t*=j;
		}
		System.out.println(1+"=");
		System.out.println(t);
		
		
		
	}

}
