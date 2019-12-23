package oop1223;

import java.io.*;

public class Test08_input {
  public static void main(String[] args) {
    //파일 내용 읽기
    FileReader fr=null;
    BufferedReader br=null;
    
    try {
      
    	String fileName="D:/java1209/workspace/basicJava/src/oop1210/Welcome.java";
    	
    	fr=new FileReader(fileName);
    	
    	br=new BufferedReader(fr);
    	
    	int num=0; // 행번호 
    	
    	while(true) {
    		// 엔터(\n)를 기준으로 가져온다
    		String line= br.readLine();
    		if(line==null) {
    			break;
    		}
    		
    		//System.out.println(line);
    		System.out.printf("%3d %s\n", ++num,line);
    		
    		//20행마다 밑줄 긋기 
    		if(num%20==0) {
    			System.out.println("----------------------------------");
    		}
    		
    		
    	}
    	
    	
    	
    }catch (Exception e) {
        System.out.println("파일읽기실패:"+e);
    }finally {
      try {
          if(fr!=null) {fr.close();}
      }catch (Exception e) {}
      
      try {
          if(br!=null) {br.close();}
      }catch (Exception e) {}   
    }//try end
    
    
    
    
    

  }//main() end
}//class end
