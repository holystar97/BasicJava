package oop1211;

public class Test03_if {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//제어문 
		//->프로그램의 흐름을 제어한다 
		// ->조건문 : if, switch~ case 
		//->반복문: for, while, do~while
		// ->break, continue
		
		/*
		 * if(조건) {조건이 true이면 처리 }
		 *
		 * 
		 *  if(조건) {조건이 true이면 처리 }
		 *  else{조건이 false 이면 수행 }
		 * 
		 * 
		 *  if(조건1) {}
		 *  else if (조건2) {}
		 *  else if (조건3) {}
		 *  else{}
		 * 
		 * */
		

		String name="무궁화";
		int kor=30,eng=95,mat=100;
		//평균구하기 
		
		int aver= (kor+eng+mat)/3;
		
		System.out.println("이름: "+name);
		System.out.println("국어: "+kor);
		System.out.println("영어: "+eng);
		System.out.println("수학: "+mat);
		System.out.println("평균: "+aver);
		
		//문) 평균이 95점이상 "장학생" 출력하시오 
		if (aver>=95) {
			System.out.println("장학생");
		}
		
		//문)국어점수가 70점이상 "합격" 아니면 불합격 
		if (kor >=70 ) {
			System.out.println("합격");
		}
		else {
			System.out.println("불합격");
		}
		
		//문) 수학점수가 90점 이상 이면 'A'
		//			80이상이면 'B'
		//			70이상이면 'C'
		//			60이상이면 'D'
		//			나머지 ' F'
		
		if(mat>=90) {
			System.out.println('A');
		}
		else if (mat>=80) {
			System.out.println('B');
		}
		else if (mat>=70) {
			System.out.println('C');
		}
		else if (mat >=60) {
			System.out.println('D');
		}
		else {
			System.out.println('F');
		}
		
		//문 ) 과락
		//   평균이 70점 이상이면 "합격"
		// (단, 국영수 세과목중에서 한과목이라도 40점 미만이면 "재시험") 
		//  평균이 70미만이면 무조건 "불합격"
		
		if(aver>=70) {
			if(kor <40 || eng <40 || mat <40) {
				System.out.println("재시험");
			}
			else {
				System.out.println("합격");	
			}
			
			if(kor >=40 && eng >=40 && mat >=40) {
				System.out.println("재시험");
			}
			else {
				System.out.println("합격");	
			}
			
			
		}
		else {
			System.out.println("불합격");
		}
		
		
		
		
		
		
		
		
		
		
		
	}

}
