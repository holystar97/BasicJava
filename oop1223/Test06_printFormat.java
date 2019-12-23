package oop1223;

public class Test06_printFormat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//출력 서식 
		//큰 따옴표 (") 출력 
		System.out.println("\"");
		
		//역슬래쉬출력 
		System.out.println("\\");
		
		//\(경로 구분기호) 사용시 2번씩 
		System.out.println("d:\\java1209\\workspace");
		System.out.println("d:/java1209/workspace");
		
		
		/*
		 * 
		 * \n 줄바꿈
		 * \t 탭 
		 * \r 
		 * \b
		 * 
		 * */
		
		System.out.println("사과\n\n");
		System.out.println("사\n\\n\n과");
		System.out.println("사\t과");
		System.out.println("사\n\t과");
		
		
		/*
		 * %d 10진 정수형
		 * %f 실수형
		 * %c 문자형
		 * %s 문자열형 
		 * */
		
		System.out.printf("a=%d, b=%d, c=%d \n",3,5,7);
		
		System.out.printf("#%5d#\n" ,2 );
		System.out.printf("#%-5d#\n",2);
		System.out.printf("#05d#\n",2);
		
		System.out.printf("x=%f. y=%f, z=%f\n", 1.2, 4.5, 6.7);
		System.out.printf("#%6.2f# \n", 7.8);
		System.out.printf("#%-6.2f# \n", 7.8);
		System.out.printf("#%.2f# \n",7.8);
		
		System.out.printf("%s %s %s \n", "Year","Month","Date");
		System.out.printf("#%8s# \n","HAPPY");
		System.out.printf("#%-8s# \n","HAPPY");
		
		System.out.printf("이름 :%s\n 나이:%d\n 키 :%.2f\n", "김옥돌",25,180.9);
		
	}

}
