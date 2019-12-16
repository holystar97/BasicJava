package oop1213;

public class Test03_Quiz {

	public static void main(String[] args) {
		
		int[] su = {-3,- 7, -8, -1, -9};
		int size = su.length;
		
		// Quiz1) su 배열 요소의 전체 합을 구하시오
		/*
		int sum = su[0];
		
		for (int i = 1; i < size; i++)
		{
			sum += su[i];
		}
		System.out.println("Sum of su : " + sum);
		*/
		
		// Quiz2) 음수의 갯수를 구하시오
		/*
		int nCount = 0;
		
		for (int i = 0; i < size; i++)
		{
			if(su[i] < 0) nCount++;
		}
		System.out.println("Negetive number on Su : "+ nCount);
		*/
		
		// Quiz3) su[0] 요소의 등수를 구하시오
		/*
		int rank = 1;				// 초기 비교대상자의 등수는 1등이라고 가정
		int compNumber = su[0];
		
		for (int i = 1; i < size; i++)
		{
			if (compNumber < su[i]) rank++;
		}
		System.out.println("Ranking of s[0] " + compNumber + " is " + rank);
		*/
		
		// Quiz4) 최대값, 최소값을 각각 구하시오
		/*
		int maxNum = su[0]; 
		int minNum = su[0];
		
		for (int i = 1; i < size; i++)
		{
			if (maxNum < su[i]) maxNum = su[i];
			if (minNum > su[i]) minNum = su[i];
		}
		
		System.out.println("Maximum number : " + maxNum);
		System.out.println("Minimum number : " + minNum);
		*/
		
		// Quiz5) 배열 내 요소 별 등수를 구하시오
		
		int[] rankArr = {1, 1, 1, 1, 1};
				
		// Calculating Per ranking 
		for (int i = 0; i < size; i++)
		{
			for (int j = 0; j < size; j++)
			{	
				if (su[i] < su[j] ) rankArr[i]++;
			}
		}
		
		//Print rankArray
		for (int i = 0; i < size; i++)
		{
			System.out.println(String.format("%2d", su[i]) + " : " + rankArr[i]);
		}
		
	}

}