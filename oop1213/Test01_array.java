package oop1213;

public class Test01_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Array 배열 
		// -> 하나의 변수에 2개 이상의
		// -> 동일한 자료형의 값을 저장할 수 있는 공간 
		// ->요소 element
		// ->순서, 색인 . index
		//-> 1차원 배열
		//-> 2차원 배열
		//-> 3차원 배열: 자바에는 없는 개념 
		// ->열 : column. 칸 
		//->행: row, 줄 
		// -> new 연산자로 메모리 할당(확보) 후 사용한다 
		
		
		/*
		int [] kor=new int[3];
		kor[0]=50; // 배열의 순서는 0부터 시작 
		kor[1]=40;
		kor[2]=65;
		System.out.println(kor[0]);
		System.out.println(kor[1]);
		System.out.println(kor[2]);
		
		System.out.println(kor.length);
		*/
		
		//메모리 할당과 초기값 대입 
		int[] kor = {50,65,60};
		int size=kor.length;
		for(int i=0; i<size;i ++) {
			System.out.println(i);
		}
		
		double[] aver= {1.2, 3.4, 5.6};
		for(int i=0; i<aver.length; i++ ) {
			System.out.println(aver[i]);
		}
		
		char[] ch= {'H','E','L','L','O'};
		for(int i=0; i<ch.length;i ++) {
			System.out.println(ch[i]);
		}
		
		String[] name= {"진달래","개나리","무궁화"};
		for(int i=0; i<name.length; i++) {
			System.out.println(name[i]);
		}
		
	}

}
