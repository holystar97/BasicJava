package oop1224;

import java.io.FileWriter;
import java.io.PrintWriter;

public class Test03_output {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String fileName="d:/java1209/workspace/sungjuk.txt";
		
		FileWriter fw=null;
		PrintWriter out=null;
		
		try {
			
		fw= new FileWriter(fileName,false);
		out=new PrintWriter(fw,true);
		out.println("무궁화,95,90,100");
		out.println("홍길동,100,100,100");
		out.println("라일락,90,95,34");
		out.println("개나리,85,70,75");
		out.println("진달래,35,40,60");
		
		System.out.println("sungjuk.txt데이터  파일 완성 !! ");
		
		
		
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("실패: "+ e);
		} finally {
			try {
				if(out!=null) {out.close();}
			} catch (Exception e2) {
				// TODO: handle exception
			}
		
			try {
				if(fw!=null) {fw.close();}
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
		
		
	}

}
