package oop1212;

public class Test05_Quiz {
  public static void main(String[] args) {
    // 연습문제

    /*
             문1) 운행거리에 따라 택시 요금을 계산하는 프로그램  
           2000m까지는 기본요금 900원이고
           2000m초과 운행시 200m단위마다
                     기본요금에 100원씩 가산하여 요금을 계산한다
    */

	  /*
    int n=2500;
    int cost=900;
    int cnt=0;
    if(n>2000) {
    	 while(n-2000>100) {
    		 n-=200;
    		 cnt++;	 
    	 }	
    }
	cost+=cnt*100;
	 
	 System.out.println(cost);
	  */
	  
	  

    //문2) 1~100중에서  2의 배수이면서 3의 배수의 갯수를 구하시오
    /*
	 int cnt=0;
	for(int i=1; i<=100; i++) {	
		if(i%2==0 && i%3==0) {
			cnt++;
		}
	}
	System.out.println(cnt);
	 */
	 
	 

    //문3) 소문자 중에서 모음의 갯수를 구하시오  -> 모음 'a','e','i','o','u'

	  /*
	int cnt=0;
	for(int i='a'; i<'z';i++) {
		if(i=='a' || i=='e' || i=='i'|| i=='o' || i=='u') {
			cnt++;
		}
	}
	System.out.println(cnt);
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
	int cnt=0;
	for(int i='A'; i<='Z'; i++) {
		cnt++;
		System.out.print((char)i);
		if(cnt %5==0) {
			System.out.println();
		}
	}
	   */
    
    //문5) 1~100중에서  짝수의 합, 홀수의 합을 각각 구하시오

	  /*
	  int esum=0;
	  int osum=0;
	  
	  for(int i=1; i<=100;i++) {
		  
		  if(i%2==0) {
			  esum+=i;
		  }
		  
		  else if(i%2==1) {
			  osum+=i;
		  }
		  
	  }
	  
	  System.out.println("짝수의 합: "+ esum);
	  System.out.println("홀수의 합: "+ osum);
	  */



    //문6) 다음식의 결과를 구하시오
    //     1-2+3-4 ... +99-100 = ?

/*
	  int osum=0;
	  int esum=0;
	  int total=0;
	  for(int i=1; i<=100; i++) {
		  
		  if(i%2==0) {
			  osum+=i;
		  }
		  
		  else {
			  esum+=i;
		  }
		  
	  }
	 total= esum-osum;
	 System.out.println(total);
	  
	  */
	  
	  

    //문7) 두수사이의 합을 구하시오
    //     2+3+4+5=14
    //     5+4+3+2=14
	  /*
	 int n=2;
	 int m=5;
	 int s=0;
	 int e=0;
	 
	 int sum=0;
	  if(n<m) {
		  s=n;
		  e=m;
	  }
	  else if (n>m) {
		  s=m;
		  e=n;
	  }
	  System.out.print(s);
	  sum+=s;
	  for(int i=s+1;i<=e;i++) {
		  sum+=i;
		  System.out.print("+"+i);	  
	  }
	System.out.print("=");
	System.out.print(sum);
	  */
	  
	  
	  
	  
	  
	  


    //문8)다음식의 결과를 구하시오
    /*
      1    2    3    4    5      99
      ─ - ─ + ─ - ─ + ─ ... ── = ?
      2    3    4    5    6      100
      
      -> (1/2) - (2/3) + (3/4) ...
    */


    

    /*
            문9)
                  어느 달팽이는 낮에는 3cm올라가고
                  밤에는 2.5cm 내려온다고 할때
                  달팽이가 13cm의 나무 꼭대기에 올라가려면
                  며칠이 걸리는지 구하시오
    */

	 
	 
	 
	 
	 
	 
	 
	 
	 
	 


    
    //문10)3의 배수의 누적 합이 100이 넘어가려면
    //    3부터 어디까지 더해야 하는지 구하시오
    //    출력결과) 3+6+9+12+...=




    //문11)누적의 합
    /*    
       1+....+10=55
       1+....+20=210
       1+....+30=
  
       1+....+90=
       1+....+100=5050   
    */   

/*
	  int sum=0;
	  for(int i=10; i<=100;i+=10) {
		  sum=0;
		  for(int j=1;j<=i;j++) {
			  sum+=j;		  
		  }
		  System.out.println("1+...."+i +"="+sum);
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
	  int m=1;
	  int sum=0;
	  for(int i=0;i<=100;i++) {
		 if(i%10==0) {
			 
		m=i;
		 for(int j=m+1;j<=m+10;j++) {
			 sum+=j;
			 
		 } 		
		 
	
		 System.out.println(m+1+"+...."+(m+10)+"="+sum);
		 
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
	  for(int i=0; i<4;i++) {
		  
		  for(int j=0; j<4; j++) {
			  
			  if(i==j) {
				  System.out.print("@");
			  }
			  
			  if(j==3) {
				  System.out.print(" ");
			  }
			  else {
				  System.out.print("★");	  
			  }
			  
		  }
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
    */    
    
	  int g2=5;
	  int g3=5;
	  int g5=5;
	 
	  
	  
	  
	  
	  
    
    
    

  }//main() end
}//class end
