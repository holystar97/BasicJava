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
		
		
		
		
		
		
	 
	}

}
