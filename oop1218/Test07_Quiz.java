package oop1218;

import java.util.Calendar;

public class Test07_Quiz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//문자열 관련 함수 연습문제 /
		
		/*
		 * 문) 이메일 주소에  @ 문자가 있으면 
		 * @ 글자 기준으로 문자열을 분리해서 출력하고 
		 * @ 문자가없다면  "이메일 주소 틀림 " 메세지를 출력하시오 
		 * 출력결과 : webmaster 
		 * 			soldesk.com 
		 * */
		
		String email="webmaster@soldesk.com";
		
		// 위치를 알아고  substring을 잘 쓰면 됩니다 
		
		/*
		int n=email.indexOf('@');
		System.out.println(n);
		
		if(n<0) {
			System.out.println("이메일 주소 틀림 ");
		}
		
		
		String f=email.substring(0,n);
		System.out.println(f);
		
		String l=email.substring(n+1,email.length());
		System.out.println(l);
		*/
		
		int pos=email.indexOf("@");
		if(pos==-1) {
			System.out.println("이메일 주소 틀림 ! ");
		}else {
			System.out.println("이메일 주소 맞음 ! ");
			
			String id=email.substring(0,pos);
			String server=email.substring(pos+1,20);
		}
		
		
		
		
		
		
		
		
		// 문2) 주민번호 각 숫자의 누적의합을 구하시오 
		/*
		 * 주민번호를 이용해서 아래와 같이 출력하시오 
		 * 생년월일 : 2015년 12월 30일 
		 * 성별 : 여자 
		 * 나이 : 4
		 * 주민 번호 각 숫자의 전체 합 :37
		 * -> 1 5 1 2 3 0 4 1 2 3 5 6;
		 * 
		 * 
		 * */
	
		
		/*
		
		String jumin="1512304123456";
		
	
		String birth=jumin.substring(0, 6);
		System.out.println(birth);
		
		System.out.print("생년월일 : ");
		String yy=jumin.substring(0,2);
		//System.out.print(yy);
		int yy2=2000+Integer.parseInt(yy);
		System.out.print(yy2+"년");
		
		int age=2019-yy2;
		
		String mm=jumin.substring(2,4);
		System.out.print(mm+"월");
		String dd=jumin.substring(4,6);
		System.out.print(dd+"일");
		
		
		System.out.println();
		
		String gender=jumin.substring(5,7);
		//System.out.println(age);
		int gender2=Integer.parseInt(gender);
		//System.out.println(age2);
		if(gender2 %2==0) {
			System.out.println("성별 : 여자");
		}else {
			System.out.println("성별: 남자");
		}
		
		System.out.print("나이: " + age);
		
		for(int i=0; i<jumin.length();i++) {
			
			
		}
		*/
		
		String jumin="1512304123456";
		
		int code=Integer.parseInt(jumin.substring(6,7));
		
		
		int myYear=Integer.parseInt(jumin.substring(0,2))+2000;
		int myMonth=Integer.parseInt(jumin.substring(2,4));
		int myDate= Integer.parseInt(jumin.substring(4,6));
		
		
		String gender="";
		switch(code%2) {
			case 0: gender= "여자"; break;
			case 1: gender= "남자"; break;
		}
		
		int myAge= 2019-myYear;
	
		System.out.println("생년월일");
		System.out.println(myYear+"년");
		System.out.println(myMonth+"월");
		System.out.println(myDate+"일");

		System.out.println();
		System.out.println("성별  "+ gender);
		System.out.println("나이"+ myAge);
		
		/*
		int hap=0;
		for(int i=0; i<jumin.length();i++) {
			hap+=Character.getNumericValue(jumin.charAt(i));
		}
		System.out.println(hap);
		*/
		
		
		int hap=0;
		for(int i=0; i<jumin.length();i++) {
			hap+=Integer.parseInt(jumin.substring(i,i+1));
		}
		System.out.println(hap);
		
		
	
		// 짝수면 여자, 홀수면남자 
		// string으로 substring 한다음 에 parseint로 정수로 바꾸기 
		
		
	}

}
