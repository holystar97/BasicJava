package oop1211;

public class Test05_Quiz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//if,swtich 연습문제 
		// 문1 ) 임의의 수가 양수, 음수 ,제로인지 출력하시오 
		int a=-3;
		if(a>=0) {
			System.out.println("양수");
		}else if(a<0) {
			System.out.println("음수");
		}else {
			System.out.println("제로");
		}
		
		//문2) 연산기호에 따라 결과값을 출력하시오 
		
		int i=5,j=7;
		char op='+'; // 5+7=12
		
		int res1=0; // 정수형 계싼 결과 값
		double res2=0.0; // 실수형 계산 결과 값 
		
		switch(op) {
			
		case '+':res1=i+j; break;
		case '-':res1=i-j; break;
		case '*':res1=i*j; break;
		case '/':res2=(double)i/j; break;
		case '%':res1=i%j; break;
		}
		
		if(op=='/') {
			System.out.println(i+""+op+""+j+"="+res2);
		}else {
			System.out.println(i+""+op+""+j+"="+res1);
		}
		
		//문3) 주민번호를 이용해서 나이와 성별을 출력하시오
		// 나이 : 올해년도-태어난년도
		// -> 성별코드가 1또는 2 이면 1900년 태생 
		//->  성별코드가 3또는 4이면 2000년 태생
		// 성별 : 1또는 3 -> 남자 
		//     2또는 4 -> 여자 
		
		
		int myYear=15; //태어난 연도
		int code=4; // 성별 코드
		
		//태어난 연도 완성하기 
		switch(code) {
		
		case 1:
		case 2: myYear=1900+myYear; break;
		case 3:
		case 4: myYear=2000+myYear; break;
		
		}
		
		//나이 
		int myAge=2019-myYear;
		System.out.println("나이 :" +myAge);
		
		//성별 
		String gender="";
		switch(code) {
		case 1: gender="남자"; break;
		case 2: gender="여자"; break;
		case 3: gender="남자"; break;
		case 4: gender="여자"; break;
		}
		
		System.out.println("성별 : "+ gender);
		
		
		
	 
	}

}
