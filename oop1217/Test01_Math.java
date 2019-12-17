package oop1217;

public class Test01_Math {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Math 수학 관련 클래스 
		
		//절댓값 
		System.out.println(Math.abs(-5));
		System.out.println(Math.ceil(1.3));
		System.out.println(Math.floor(2.7));
		System.out.println(Math.round(3.8));
		
		System.out.println(Math.max(3, 5));
		
		//random 무작위
		// 난수: random 값 
		// -> 시스템이 발생 시킨 값 
		//->발생범위: : 0.0 <=r < 1.0
		//System.out.println(Math.random());
		// 정수값만 가져오기 
		//0 1 2 3 
		System.out.println((int)(Math.random()*4));
		//0 1 2 3 4 
		System.out.println((int)(Math.random()*5));
		
		//문) 주사위 수 의 범위 : 1 ~ 6
		
		System.out.println((int)(Math.random()*6)+1);
		
		//문) 로또번호 범위 : 1~45
		
		System.out.println((int)(Math.random()*45)+1);
		
		
		
		
		
		
	}

}
