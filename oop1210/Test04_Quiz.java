package oop1210;

public class Test04_Quiz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//연산자 연습 
		//문 1 ) 지폐의 갯수를 구하시오 
		
		int money=54630;
		
		/*출력결과
		 * 만원 5장
		 * 천원 4장
		 * 백원 6장
		 * 십원 3장 
		 * */
		
		/*
		System.out.printf("만원 : %d 장\n ", money/10000);
		money=money%10000;
		System.out.printf("천원 : %d 장\n ", money/1000);
		money=money%1000;
		System.out.printf("백원 : %d 장\n ", money/100);
		money=money%100;
		System.out.printf("십원 : %d 장\n ", money/10);
		money=money%10;
		*/
		
		/*
		int m=money/10000;
		System.out.println("만원" + m +"장");
		
		money=money%10000;
		int c=money/1000;
		System.out.println("천원" + c+ "장");
		*/
		
		
		//문2 ) 임의의 정수값이 짝수인지 확인하시오 (2의배수)
		
		int a=4;
		System.out.println(a%2==0);
		
		//문3)임의의 정수값이 3의 배수 인지 확인하시오
		int b=6;
		System.out.println(b%3==0);
		
		//문4)임의의 정수값이 4이배수인지 확인하시오 
		b=8;
		System.out.println(b%4==0);
		
		//문5) 임의의 정수 값이 2의 배수 이면서 5의 배수 인지 확인 
		System.out.println(b%2==0 && b%5==0);
		
		//문6)임의의 문자가 'M'또는 'm'인지 확인하시오 
		char ch='M';
		System.out.println(ch=='m' || ch== 'M');
		
		//문7)국어점수가 80~89사이인지 확인하시오 
		int kor=85;
		System.out.println(kor>=80 && kor <=89);
		
		
		//문8)임의의 문자가 대문자인지 확인하시오 
		
		char k='A';
		System.out.println('A'<=k && k<='Z');
		
		//문9)해당 년도가 윤년인지 확인하시오
		//윤년 : 4년마다 한번씩 오는 것 
		
		int y=2020;
		System.out.println(y%4==0);
		
		
		
			
		
	}

}
