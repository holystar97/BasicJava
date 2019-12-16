package oop1213;

public class Test06 {

	public static void main(String[] args) {
		// 문자형 2차원 배열 연습문제
		char[][] ch = {
				{'R', 'e', 'd'},
				{'G', 'r', 'e', 'e', 'n'},
				{'B', 'l', 'u', 'e'}
		};
		// Quiz 1) 각 행의 모음의 갯수를 출력하시오
		// Quiz 2) 대문자의 개수를 출력하시오
		
		int row = ch.length;
		int vowel = 0, upperCount = 0;
		
		for (int i = 0; i < row; i++)
		{
			for (int j = 0; j < ch[i].length; j++)
			{
				if(ch[i][j] >= 'A' && ch[i][j] <= 'Z') upperCount++;		// 대문자 산출
					
				switch (ch[i][j]) {											// 모음 산출
				case 'a' : case 'A' : vowel++; break;			
				case 'e' : case 'E' : vowel++; break;
				case 'i' : case 'I' : vowel++; break;
				case 'o' : case 'O' : vowel++; break;
				case 'u' : case 'U' : vowel++; break;
				}
			}
			System.out.println((i+1) +"행의 모음 개수 : " + vowel);
			vowel = 0;
		}
		System.out.println("대문자 개수 : " + upperCount);
		
	}// main() end

}// class end