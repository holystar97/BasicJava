package oop1218;

public class Test06_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//문자열 관련 클래스 
		//String 
		//StringBuffer
		//StringBuilder
		
		
		//문자열 연산 속도
		// ->String < StringBuffer < StringBuilder
		
		/*
		String str=""; // 빈문자열값 
		str =str+"one";
		System.out.println(str);
		
		str =str+"three";
		System.out.println(str);
		
		str+="five";
		System.out.println(str);
		
		str="";
		System.out.println(str.length());
		*/
		
		
		/*
		StringBuilder sb=null;
		// 참조변수선언
		// 메모리할당 하지 않음 
		sb = new StringBuilder();
		sb.append("one");	
		System.out.println(sb.toString());
		sb.append("three");	
		System.out.println(sb.toString());
		sb.append("five");	
		System.out.println(sb.toString());
		
		sb.delete(0,sb.length());
		System.out.println(sb.length());
		*/
		
		String name=new String("soldesk");
		String str="Gone With The Wind";
		
		/*
		//글자 갯수
		System.out.println(str.length());
		
		//맨 앞글자 
		System.out.println(str.charAt(0));
		
		//맨마지막 글자 
		System.out.println(str.charAt(17));
		//문)length() 이용해서 맨 마지막 글자를 출력해보기 	
		System.out.println(str.length()-1);
		 */
		
		/*
		for(int i=0; i<str.length();i++) {
			
			if(str.charAt(i)>='A' && str.charAt(i)<='Z') {
				Character t1=new Character(str.charAt(i));
				System.out.print(t1.toLowerCase(t1));
			}
			else{
				System.out.print(str.charAt(i));	
			}
			
		}
		*/
	
		/*
		for(int i=0; i<str.length(); i++) {
			
			char c=str.charAt(i);
			if(Character.isUpperCase(c)) {
				System.out.println(Character.toLowerCase(c));
			}else if (Character.isLowerCase(c)) {
				System.out.println(Character.toUpperCase(c));
			}else {
				System.out.println(c);
			}
		}
		
		// "G" 문자열의 순서값 (index) 
		System.out.println(str.indexOf("G"));
		System.out.println(str.indexOf("e"));
		System.out.println(str.indexOf("k"));
		
		//전부 소문자로 변환 
		System.out.println(str.toLowerCase());
		//전부 대문자로 변환
		System.out.println(str.toUpperCase());
		
		//'n' -> 'N'으로 치환 
		System.out.println(str.replace('n', 'N'));
		
		//문자열 갯수가 0인지 ?
		if (str.isEmpty()) {
			System.out.println("빈문자열이다");
		}
		else {
			System.out.println("빈문자열이 아니다");
		}
		*/
		// 앞에서부터 문자열 비교 
		System.out.println(str.startsWith("Gone"));
		
		// 뒤에서부터 문자열 비교
		System.out.println(str.endsWith("Wind"));
		
		// 전체 문자열 내용 비교 
		System.out.println("sky".equals("hi"));
		
		//문자열 일부분만 추출 ★
		//6번째~ 마지막까지 
		System.out.println(str.substring(6));
		System.out.println(str.substring(6,12));
		
		// "Go" 이 두 글자만 자르기 
		System.out.println(str.substring(0,2));
		
		// 첫번째 글자 -> "G"
		System.out.println(str.substring(0,0));
		
		// 마지막 글자 -> "d"
		System.out.println(str.substring(17,18));
		
		System.out.print(str.substring(str.length()-1, str.length()));
		
		System.out.print(str.substring(str.length()-1));
		
		
	}

}
