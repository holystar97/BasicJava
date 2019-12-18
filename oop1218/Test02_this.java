package oop1218;

class Sungjuk {
	
	private String name;
	private int kor,eng, mat;
	private int aver;
	
	//public Sungjuk() {Sungjuk("김옥돌");}
	public Sungjuk() {this("김옥돌");}
	public Sungjuk(String name) {
		this.name=name;
	}
	public Sungjuk(int kor,int eng,int mat) {
		this("나옥돌");
		this.kor=kor;
		this.eng=eng;
		this.mat=mat;
		
	}
	
	public Sungjuk(int aver) {
		
		disp();
	}
	
	public void disp() {
//		this(85);
		
	}
}


public class Test02_this {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		
		
		
	}

}
