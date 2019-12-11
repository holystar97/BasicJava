package oop1211;

public class Test02_operator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		int a=3;
		a=a*-1; // 이항 연산자
		System.out.println(a);
		System.out.println(-a); // 단항 연산자
	*/	
		//삼항연산자
		//형식 )  (조건) ? 참: 거짓
		//-> 조건값은 boolean형으로 반환한다
		
		// 문) 임의의 값이 양수, 음수인지 반환하시오 
		
		/*
		
		int a=3;
		
		String result=(a>0)? "양수":"음수";
		System.out.println(result);
		
		result=(a<0)? "음수" : "양수";
		System.out.println(result);
		
		
		//문) 짝수, 홀수 인지 확인하시오 
		result=(a%2==0) ? "짝수" : "홀수";
				//3%2
				//1 ==0 ?		"홀수"
		System.out.println(result);
		
		//문) 세개의 수 중에서 가장 큰 값을 구하시오
		int x=3, y=7, z=5;
		
		int big1=(x>y)? x:y;
		
		int big2=(big1>z)? big1:z;
		
		System.out.println(big2);
		
		
		*/
		
		//문) 대소문자를 서로 바꿔서 출력하시오 
		
		char ch='n';
		
		char res=('A'<=ch && ch <='Z')? (ch=(char) (ch+32)): (ch=(char) (ch-32));
		
		System.out.println(res);
		
		//문) 윤년,평년 을 출력하시오 
		
		int y=2020;
		String leap=(y%4==0 && y%100!=0 || y%400==0) ? "윤년": "평년";
		
		System.out.println(leap);
		
		
		
		
		
		
		
	}

}
