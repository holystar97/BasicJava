package oop1212;

public class Test04_while {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//1 while(조건) {조건이 true 이면 수행 }
		// while(true) {} => 무한 loop
	/*
		int a=1;
		while(a<=3) {
			System.out.println("java");
			a=a+1;
		}
		*/
		/*
		int a=1;
		while(true) {
			System.out.println("java");
			if(a==5) {
				break;
			}
			a=a+1;
		}
	*/
		
		
		//2 do while 
		
		//do{
		//	조건이 true이면 수행
		//}while(조건);
		
		// 조건이 거짓이어도 무조건 1번은 수행된다 
		/*
		int a=1;
		do {
			System.out.println("java");
			a=a+1;
		}while(a<=3);
		*/
		
		
		//문) x값이 10으로부터 x를 여러번 뺀 후 
		// 	결과가 음수가 되면 x를 몇번 뺏는가를 구하시오 
		
		/*
		int n=10;
		int x=3;
		int m=10;
		int cnt=0;
		while(n>0) {
			n=n-x;
			cnt++;
		}
		
		System.out.println(cnt);
		
		*/
		
		int x=3;
		int num=10;
		int count=0;
		
		while(true) {
			count=count+1;
			num=num-x;
			if(num<0) {
				break;
			}
		}
		
		System.out.println(count);
		
		
		
	}

}
