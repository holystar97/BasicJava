package oop1213;
// 성적 프로그램 완성하기
// 인원 별 평균, 석차 산출하기

public class Test05_sungjuk {

	public static void main(String[] args) {
		// 변수 정의
		String[] name = {"John", "Lilly", "David", "Marry", "Jason"};	
		int[] kor 	= {100, 86, 48, 91, 74};
		int[] eng 	= {100, 84, 12, 56, 43};
		int[] math 	= {100, 82, 75, 67, 84};
		
		int size = name.length;
		int[] average = new int[size];
		int[] rank = {1, 1, 1, 1, 1};
		String[] result = new String[size];
		String[] star = new String[size];
		
		// 평균 산출 for문
		for (int i = 0; i < size; i++) 
		{
			average[i] = (kor[i] + eng[i] + math[i]) / 3;	
		}
		
		// 석차 산출 for문
		for (int i = 0; i < size; i++)
		{
			for (int j = 0; j <size; j++)
			{
				if (average[i] < average[j]) rank[i]++;	
			}
		}
		
		// 과락 여부 판별
		// 평균  70점 이상 "합격", 70점 미만일 시 "불합격"
		// (단, 국영수 3과목 중 1과목이라도 40점 미만 시 "재시험")
		for (int i = 0; i < size; i++)
		{
			result[i] = " ";
			if(kor[i] < 40 || eng[i] < 40 || math[i] < 40)
				result[i] = "Retest";
			else if(average[i] < 70)
				result[i] = "Fail";
			else
				result[i] = "Pass";
		}
		
		// * 산출
		// 평균 10점당 * 1개씩 증가
		for (int i = 0; i < size; i++)
		{
			star[i] = " "; // 초기화 필요! 안하면 null값으로 생성됨
			for (int j = 0; j < (average[i]/10); j++)
			{
				star[i] += "*";
			}
		}
		
		// 장학생 판별
		
		// Print name, average, rank Information
		int checkKorea = 5;
		for (int i = 0; i < size; i++) 
		{
			System.out.print(String.format("%-6s",name[i]) + " ");
			System.out.print(String.format("%-6d",kor[i]) + " ");
			System.out.print(String.format("%-6d",eng[i]) + " ");
			System.out.print(String.format("%-6d",math[i]) + " ");
			System.out.print(String.format("%-6d", average[i]) + " ");
			System.out.print(String.format("%-3d", rank[i]) + " ");
			System.out.print(String.format("%-6s",result[i]) + " ");
			System.out.print(String.format("%-10s", star[i]) + " ");
			
			if(average[i] >= 95) System.out.print(String.format("%-18s","Scholarship")); // 장학생 출력
			
			System.out.println();
		}
		
	}

}