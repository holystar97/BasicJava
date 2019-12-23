package oop1223;

public class Test01_exception {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
		System.out.println(1);
		System.out.println(2/0);
		System.out.println("END");
	*/
		
		//exception 처리를 한 경우 
		/*
		try {
			//﻿예외가 발생할 예상이 되는 코드를 작성합니다
			System.out.println(1);
			System.out.println(2/0);
			System.out.println(3);
		}catch(ArithmeticException e) {
			System.out.println(e);
		}
		System.out.println("END");
		
		*/
		
		/*
		try {
			System.out.println(1);
			int [] num=new int[3];
			num[5]=7;
			System.out.println(2);
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println(e);
		}
		System.out.println("END");
		*/
		/*
		try {
			System.out.println(1);
			int num=Integer.parseInt("soldesk");
			System.out.println(2);
			
		} catch (NumberFormatException e) {
			// TODO: handle exception
			System.out.println(e);
		}
		System.out.println("END");
		
		*/
		/*
		try {
			System.out.println(1);
			Integer inte=null;
			System.out.println(3/inte);
			System.out.println(2);
			
		} catch (NullPointerException e) {
			// TODO: handle exception
			System.out.println(e);
		}
		System.out.println("END");
		*/
		
		/*
		try {
			int a=3/0;
			int b=Integer.parseInt("soldesk");
			int[] num=new int[3];
			num[4]=2;
		} catch (ArithmeticException e) {
			System.out.println(e);
		}catch(NumberFormatException e) {
			System.out.println(e);
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		}catch(NullPointerException e) {
			System.out.println(e);
		}
		
		System.out.println("END");
		*/
		
		try {
			System.out.println("OPEN");
			System.out.println(1);
			System.out.println(3);
		} catch (Exception e) {
			System.out.println(e);
		}finally {
			System.out.println("CLOSE");
		}
		System.out.println("END");
		
	}

}
