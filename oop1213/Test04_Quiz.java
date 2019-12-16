package oop1213;

public class Test04_Quiz {

	public static void main(String[] args) {
		// 문자 배열 연습문제
		  
		char[] ch = {'S', 'o', 'l', 'd', 'e', 's', 'k'};
		
		//Quiz 1) 대문자, 소문자의 개수를 각각 구하시오.
		System.out.println("### Quiz1 ###");
		int upperCount = 0;
		int lowerCount = 0;
		
		for (int i = 0; i < ch.length; i++)
		{
			if (ch[i] >= 'a' && ch[i] <= 'z') lowerCount++;
			else upperCount++;
		}
		
		System.out.println("대문자 : " + upperCount);
		System.out.println("소문자 : " + lowerCount);
		
		//Quiz 2) 모음의 갯수를 구하시오.
		System.out.println("\n### Quiz2 ###");
		int vowel = 0;
		
		for (int i = 0; i < ch.length; i++)
		{
			switch (ch[i]) 
			{
				case 'a': vowel++; break;
				case 'e': vowel++; break;
				case 'i': vowel++; break;
				case 'o': vowel++; break;
				case 'u': vowel++; break;
			}
		}
		System.out.println("모음 : " + vowel);
		
		//Quiz 3) 대문자와 소문자를 서로 바꿔서 출력하시오.
		System.out.println("\n### Quiz3 ###");
		for (int i = 0; i < ch.length; i++)
		{
			if 	(ch[i] >= 'a' && ch[i] <= 'z') ch[i]-=32;
			else ch[i]+=32;
			
			System.out.print(ch[i] + " ");
		}
		System.out.println();
		
		// Print Array
		

	}

}