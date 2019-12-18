package oop1212;

import java.util.Scanner;

public class Test05_Quiz {
  public static void main(String[] args) {
    // 연습문제

    /*
             문1) 운행거리에 따라 택시 요금을 계산하는 프로그램  
           2000m까지는 기본요금 900원이고
           2000m초과 운행시 200m단위마다
                     기본요금에 100원씩 가산하여 요금을 계산한다
    System.out.println("### Quiz 1 ####");
    int totalFee = 900;
    
    System.out.print("Enter the distance : ");
    Scanner stdIn = new Scanner(System.in);
    int distance = stdIn.nextInt();
    
    totalFee = totalFee + ((distance - 2000) / 200 ) * 100;
    
    System.out.println("Your Total fee : " + totalFee);                     
    */

	 /*
    //문2) 1~100중에서  2의 배수이면서 3의 배수의 갯수를 구하시오
	  
	 System.out.println("### Quiz 2 ####");
	 int count = 0;
	 for (int num = 6; num <= 100; num+=6) {
		 count++;
	 }
	 System.out.println("Total count : " + count);
    */
	

    //문3) 소문자 중에서 모음의 갯수를 구하시오  -> 모음 'a','e','i','o','u'
	/*
	  System.out.println("### Quiz 3 ####");
	  int count = 0;
	  
	  for (char alpha = 'a'; alpha <= 'z'; alpha++) {
		  switch (alpha) {
		  default: break;
		  case 'a': count++; break;
		  case 'e': count++; break;
		  case 'i': count++; break;
		  case 'o': count++; break;
		  case 'u': count++; break;
		  }
	  }
	  System.out.println("Total : " + count);
	*/

    //문4) 알파벳을 한줄에 5개씩 출력하시오
    /*
        ABCDE
        FGHIJ
        KLMNO
        PQRST
        UVWXY
        Z
    */
	/*
	  System.out.println("### Quiz 4 ####");
	  int i = 0;
	  for (char alpha = 'A'; alpha <= 'Z'; alpha++) {
		  System.out.print(alpha);
		  i++;
		  if (i == 5) {
			  System.out.println(); 
			  i = 0;
		  }
	  }
	  
	  */
	  
    //문5) 1~100중에서  짝수의 합, 홀수의 합을 각각 구하시오
	  
	  System.out.println("### Quiz 5 ####");
	  int num = 3;
	  int oddTotal = 1;
	  int evenTotal = 2;

	  while(num <= 100) {
		  if (num %2 == 1) oddTotal += num;
		  else evenTotal += num;
		  num++;
	  } 
	  
	  System.out.println("total of odd number : " + oddTotal);
	  System.out.println("total of even number : " + evenTotal);

    //문6) 다음식의 결과를 구하시오
    //     1-2+3-4 ... +99-100 = ?
	  /*
	  System.out.println("### Quiz 6 ####");
	  int num = 3;
	  int oddTotal = 1;
	  int evenTotal = 2;
	  while(num <= 100) {
		  if (num %2 == 1) oddTotal += num;
		  else evenTotal += num;
		  num++;
	  } 
	  System.out.println("total of odd number : " + oddTotal);
	  System.out.println("total of even number : " + (-1 * evenTotal));
	  */

    //문7) 두수사이의 합을 구하시오
    //     2+3+4+5=14
    //     5+4+3+2=14
	  /*
	  int start = 2, end = 2;
	  int total = 0;
	  
	  System.out.println("### Quiz 7 ####");
	  if (start < end) {
		  for (int i = start; i <= end; i++)
			  total += i;
	  }
	  else if (start > end) {
		  for (int i = start; i >= end; i--)
			  total += i;
	  }
	  else { // ex) start = 2. end = 2일 때 total은 2일 경우
		  total = start;
	  }
	  System.out.println("Total : " + total);
	  */


    //문8)다음식의 결과를 구하시오
    /*
      1    2    3    4    5      99
      ─ - ─ + ─ - ─ + ─ ... ── = ?
      2    3    4    5    6      100
      
      -> (1/2) - (2/3) + (3/4) ...
    */
	  /*
	  System.out.println("### Quiz 8 ####");
	  
	  double total = 0.0;
	  double oper = 1;
	  
	  for (int i = 1; i < 100; i++) {
		  total = ((double)i/(i+1)) * oper;
		  oper *= -1;
	  }
	  System.out.println("Result : " + String.format("%.12f", total));
	  */
    

    /*
            문9)
                  어느 달팽이는 낮에는 3cm올라가고
                  밤에는 2.5cm 내려온다고 할때
                  달팽이가 13cm의 나무 꼭대기에 올라가려면
                  며칠이 걸리는지 구하시오
    */
	  /*
	  System.out.println("### Quiz 9 ####");
	  
	  int upCount = 0;
	  int downCount = 0;
	  int totalDay = 0;
	  
	  double climbUp = 3, climbDown = 2.5;
	  double snailPoint = 0;
	  double treeLength = 13;
	  
	  System.out.println("현재 위치 : " + snailPoint + "cm");
	  while(true) {
		  // One day
		  snailPoint += climbUp;	// 낮
		  snailPoint -= climbDown;	// 밤
		  totalDay++;				// 하루 소요
		  
		  System.out.println(totalDay + "일차 " + "현재 위치 : " + snailPoint + "cm");
		  
		  if(snailPoint >= treeLength) break;
	  }
	  
	  System.out.println("Snail spended " + totalDay + " days");
	*/
    
    //문10)3의 배수의 누적 합이 100이 넘어가려면
    //    3부터 어디까지 더해야 하는지 구하시오
    //    출력결과) 3+6+9+12+...=
	  
	  /*
	  System.out.println("### Quiz 10 ####");
	  int total = 0;
	  int num = 3, index = 1;
	  
	  while (true) {
		  if (total / 10 >= 10) {
			  System.out.println((num * index)+"까지"); 
			  break;
		  }
		  total += (num * index++);
	  }
	  */

    //문11)누적의 합
    /*    
       1+....+10=55
       1+....+20=210
       1+....+30=
  
       1+....+90=
       1+....+100=5050   
    */
	  /*
	  System.out.println("### Quiz 11-1 ####");
	  
	  int total = 0;
	  
	  for (int i = 10; i <= 100; i+=10) {
		  for (int j = 1; j <= i; j++) {
			  System.out.print(j + "+");
			  total += j;
		  }
		  System.out.println(" = "+total);
		  total = 0;
	  }
	  */


    /*    
       1+....+10=55
       11+....+20=
       21+....+30=
  
       81+....+90=
       91+....+100=    
    */
	  
	  /*
	  System.out.println("### Quiz 11-2 ####");
	  
	  int total = 0;
	  
	  for (int i = 1; i <= 100; i++) {
		  total += i;
		  System.out.print(i + "+");
		  if (i %10 == 0) {
			  System.out.println("=" + total);
			  total = 0;
		  }
	  }
	  */
	  


    /*
            문12)
                         @★★★ 
                         ★@★★
                         ★★@★
                         ★★★@
    */
	  
	  /*
	  System.out.println("### Quiz 12 ####");
	  int pointRow = 1;
	  
	  int row = 4, col = 4;
	  
	  for (int i = 1; i <= row; i++) {
		  for (int j = 1; j <= col; j++) {
			  if(j == pointRow) {
				  System.out.print("@");
			  }
			  else {
				  System.out.print("★");  
			  }
		  }
		  pointRow++;
		  System.out.println();
	  }
	  */
	  


    /*
            문13) 2g, 3g, 5g짜리 추가 각각 5개씩 있을때
                       세가지의 추의 조합으로 무게가 40~45사이일 때
                       각 추의 갯수와 무게를 출력하는 프로그램
                       
              출력결과
       2g  3g  5g   total
       1   5   5    42
       2   4   5    41
       2   5   5    44
<<<<<<< HEAD
    */    
    
	/*
	  int g2=5;
	  int g3=5;
	  int g5=5;
	 */
	  
	  /*
	  int total=0;
	  for(int a=1; a<5; a++) {
		  
		  for(int b=1; b<=5; b++) {
			  
			  for(int c=1; c<5; c++) {
				  
				  total=(a*2)+(b*3)+(c*5); // 추의 합계 
				  if(total >=40 && total <=45) {
					  System.out.println(a+ " "+ b+ " "+ c +"=" +total);
				  }
			  }
			  
	  }
	  */
	  
	  
	  /*
	  System.out.println("\n### Quiz 13 ####");
	  
	  int weightTwo = 2;
	  int weightThree = 3;
	  int weightFive = 5;
	  int total = 0;
	  
	  System.out.println("2g  3g  5g   total");
	  for (int i = 1; i <= 5; i++) {
		  for (int j = 1; j <= 5; j++) 
			  for (int k = 1; k <= 5; k++) {
				  total = i * weightTwo + j * weightThree + k * weightFive;
				  if (total >= 40 && total <= 45) {
					  System.out.println("" + i + "   " + j + "   " + k + "    " + total);
					  total = 0;
					  
				  }// for end
				  
			  }// for end
		  
	  }//for end
	  */
	  

  }//main() end
}//class end
