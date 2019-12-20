package oop1220;

import oop1220.WebProgram.Language;
import oop1220.WebProgram.Smart;

class WebProgram{
	// .jsp .asp .php
	String title="java program";
	class Language{
		
		String basic="JAVA,HTML,CSS,JavaScript";
		void display() {
			System.out.println("기초 수업: "+ basic);
		}
	}
	
	class Smart{
		
		String basic="Objective-C , Java OOP, C#";
		void display() {
			System.out.println("기초 수업 : "+ basic);
		}
	}
	
	
	public void print() {
		Language lang=new Language();
		lang.display();
		
		Smart sm=new Smart();
		sm.display();
	}
	
	
//	class R{
//		static class id {
//			static String btn="버튼";
//			
//		}
//		
//	}
	
	
	
} 

public class Test07_Inner {
	public static void main(String[] args) {
		
		WebProgram web=new WebProgram();
		web.print();
		
		
//		Language lang=new Language();
		
		
		Language lang=new WebProgram().new Language();
		Smart sm= new WebProgram().new Smart();
		
		lang.display();
		sm.display();
		
		
//		System.out.println(R.id.btn);
		
		
		
		
	}
}
