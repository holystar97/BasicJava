package oop1224;

import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class Test04_sungjuk {
  public static void main(String[] args) {
    //성적 프로그램
    //성적 입력 자료를 가져와서(sungjuk.txt)
    //성적 결과 파일 완성하기  (result.txt)
    try {
      String inName ="d:/java1209/workspace/sungjuk.txt";
      String outName="d:/java1209/workspace/result.txt";
      
      //1)단계 : 데이터 저장 변수 선언
      String[] name=new String[5];
      int[] kor =new int[5];
      int[] eng =new int[5];
      int[] mat =new int[5];
      int[] aver=new int[5];
      int[] rank={1,1,1,1,1};
      int size=5;
      
      
      //2)단계
      //-> sungjuk.txt에서 한줄씩 가져와서
      //-> ,를 기준으로 문자열 분리한 후 
      //-> 1)단계에 선언된 변수에 저장하기
      //-> split() 또는 StringTokenizer활용
      
      StringTokenizer st=new StringTokenizer(inName,",");
      while(st.hasMoreTokens()) {
    	  System.out.println(st.nextToken());
      }
      
      
      
      //3)단계
      //-> 2)단계에서 완성한 변수를 이용해서
      //-> 평균, 등수구하기
      
      
      //4)단계
      //-> result.txt 출력하기
      FileWriter  fw =new FileWriter(outName);
      PrintWriter out=new PrintWriter(fw, false);  
      
      //제목출력하기
      out.println("성/적/결/과");
      out.println("-------------");
      out.println("이름 국어 영어 수학 평균 등수 결과");
      out.println("-------------");
      
      
      
      out.close(); fw.close();
      System.out.println("성적프로그램완성OK!!");       
      
    }catch (Exception e) {
      System.out.println("실패:"+e);
    }//try end

  }//main() end
}//class end
