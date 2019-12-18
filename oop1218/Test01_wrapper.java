package oop1218;
import java.awt.*;
import javax.swing.*;
import java.lang.*; 
public class Test01_wrapper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		boolean flag=true;
		Boolean b1=new Boolean("true");
		
		System.out.println(flag);
		System.out.println(b1.toString());
		System.out.println(b1);
		
		
		int i1=3;
		Integer i2=new Integer(5);
		Integer i3=new Integer("7");
		
		System.out.println(i1);
		System.out.println(i2.doubleValue());
		System.out.println(i3.toString());
		System.out.println(i3);
		
		
		System.out.println(Integer.max(7, 9));
		System.out.println(Integer.min(2, 4));
		System.out.println(Integer.sum(5, 6));
		System.out.println(Integer.toBinaryString(10));
		System.out.println(Integer.toHexString(10));
		System.out.println(Integer.toOctalString(10));
		
		
		System.out.println(Integer.parseInt("3"));
//		System.out.println(Integer.parseInt("KOREA"));
//		System.out.println(Integer.parseInt(" 5 "));
		
		
		
		String s1="";
		String s2=null; // null 값 -> 비어있는 값 
		
//		System.out.println(Integer.parseInt(s2));
		
		long l1=3L;
		Long l2=new Long(5);
		Long l3=new Long("7");
		
		System.out.println(l1);
		System.out.println(l2.byteValue());
		System.out.println(l3);
		
		
		double d1=1.2;
		Double d2=new Double(3.4);
		Double d3=new Double("5.6");
		
		//문 ) 위의 세개의 수를 더하시오 
		
		int hap=(int)d1+d2.intValue()+d3.intValue();
		
		char c1='K';
		Character c2=new Character('B');
		System.out.println(c1);
		System.out.println(c2);
	
		
		
		System.out.println(Character.isAlphabetic('5'));
		System.out.println(Character.isWhitespace(' '));
		
		
		// 문1) 대소문자를 서로 바꿔서 출력하시오 
		
		
		
		String str="Gone With the Wind";
		
		// char 클래스 활용 
		char x=str.charAt(0);

		for(int i=0; i<str.length();i++) {
			
			if(str.charAt(i)>='A' && str.charAt(i)<='Z') {
				Character t1=new Character(str.charAt(i));
				System.out.print(t1.toLowerCase(t1));
			}
			else{
				System.out.print(str.charAt(i));	
			}
			
		}
		System.out.println();
		
		// 문2) 주민번호 각 숫자의 누적의합을 구하시오 
		String jumin="8912304123654";
		

		
		
		
		
		
		
	}

}
