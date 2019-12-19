package oop1219;


public class Test01_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		String str="Gone With The Wind";
		String[] word= str.split(" ");
		
		for(int i=0; i<word.length;i++) {
			System.out.println(word[i]);
		}
		
		System.out.println("#"+ " S k   y ".trim()+ "#");
		
		// 문) 첨부파일이 이미지 파일인지 확인 
		// 출력결과 
		// 파일명 : sky.png
		// 맞으면 "파일이 전송되었습니다" 
		// 아니면 "파일을 다시 선택해주세요 " 
		
		/*
		String filename="d:/java1209/workspace/sky.png";
		
		//1단계 : sky.png
		// 마지막 "/"문자의 인덱스
		int pos=filename.lastIndexOf("/");
		System.out.println(pos);
		
		
		// 파일명. 확장명 추출하기 
		filename=filename.substring(pos+1);
		System.out.println(filename);
		
		//2단계 :확장명 추출하기 png 
		/*
		String png=filename.substring(pos+3,filename.length());
		System.out.println(png);
		*/
		/*
		int dot=filename.indexOf(".");
		String ext=filename.substring(dot+1);
		System.out.println(ext);
		
		//3단계 :png || gif ||| jpg 인지 확인 
		
		ext=ext.toLowerCase();
		if(ext.equals("png")||ext.equals("gif")|| ext.equals("jpg")) {
			System.out.println("파일이 전송되었습니다.");
		}else {
			System.out.println("이미지 파일이 아닙니다.");
		}
		*/
		
		//과제 파일명, 확장명을 분리해서 출력하시오 
		// 파일명 2019.12.19.sky
		// 확장명 png
		String photo="d:/java1209/workspace/2019.12.19.sky.png";
		
		
		
		
		
	}

}
