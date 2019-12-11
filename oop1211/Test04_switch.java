package oop1211;

public class Test04_switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		switch(30) {
		
		case 10: System.out.println("SEOUL"); break;
		case 20: System.out.println("JEJU"); break;
		case 30: System.out.println("BUSAN"); break;
	
		}
		*/
		
		/*
		//default : 목록에 없으면 무조건 수행 
		// case 값은 반드시 순차적이지 않아도 된다. 
		switch(50) {
		
		case 10: System.out.println("SEOUL"); break;
		case 20: System.out.println("JEJU"); break;
		case 30: System.out.println("BUSAN"); break;
		default: System.out.println("etc...."); break;
		
		}
		*/
		/*
		//break 문이 없으면 계속해서 switch안에 머물러있는다.
		switch(20) {
		
		case 10: System.out.println("SEOUL"); break;
		case 20: System.out.println("JEJU"); 
		case 30: System.out.println("BUSAN"); break;
	
		}
		*/
		//문) 평균점수에 따라서 A,B,C,D,E,F 학점을 출력하시오 
		
		int kor=75, eng=85, mat=100;
		int aver=(kor+eng+mat)/3;
		
		switch(aver/10) {
		case 10:System.out.println("A");break;
		case 9:System.out.println("A");break;
		case 8:System.out.println("B");break;
		case 7:System.out.println("B");break;
		case 6:System.out.println("C");break;
		case 5:System.out.println("C");break;
		case 4:System.out.println("C");break;
		case 3:System.out.println("D");break;
		case 2:System.out.println("E");break;
		case 1:System.out.println("F");break;
		}
		
		
		
		
		
	}

}
