package oop1223;

import java.io.File;

public class Test07_File {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		try {
			// 예외 발생이 예상이 되는 코드 작성 
			// 경로명 + 파일명 
			// 경로구분 기호는 \\로 한다 
			//String pathname="D:\\java1209_setup\\setup\\epp420_64bit.exe";
			String pathname="D:/java1209_setup/setup/epp420_64bit.exe";
			File file=new File(pathname);
			
			if(file.exists()) {
				System.out.println("파일 가져오기 성공! ");
				long filesize=file.length();
				System.out.println("파일 크기: "+ filesize);
				System.out.println("파일 크기 : "+ filesize/1024 + "KB");
				
				//파일명.확장명 
				String filename=file.getName();
				System.out.println(filename);
				
				//문) 파일명과 확장명을 분리해서 출력하시오 
				//epp420_64bit
				//exe
				
				/*
				String[] filen=filename.split(".");
				
				for(String f: filen) {
					System.out.println(f);
				}
				*/
				
				int lastdot=filename.lastIndexOf(".");
				String name=filename.substring(0,lastdot);
				String ext=filename.substring(lastdot+1);
				System.out.println("파일명 : "+ name);
				System.out.println("확장명 : "+ext);
				
				//파일 삭제 
				//file.delete();
				
				
			}else {
				System.out.println("파일 없어요 ! ");
			}
			
		} catch (Exception e) {
			// 예외가 발생되면 실행할 코드 작성 
			System.out.println("File클래스 실패 : "+e);
		}
		System.out.println("END");
	}

}
