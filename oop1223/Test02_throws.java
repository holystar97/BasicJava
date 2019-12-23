package oop1223;


class Test{
	/*
	public void view() {
		try {
			int a=3/0;
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}
	public void dsip() {
		
		try {
			int a=Integer.parseInt("okdol");
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}*/
	
	
	public void view() throws Exception {
		int a=3/0;
		
	}
	
	public void disp() throws NullPointerException,
							NumberFormatException{
		int a=Integer.parseInt("okdol");
	}
	
	public synchronized void login() {
		
	}
}

public class Test02_throws {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			Test test=new Test();
			test.view();
			test.disp();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
	}

}
