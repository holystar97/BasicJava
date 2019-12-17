package oop1217;

class Score{
	
	private String name="손흥민";
	private int kor,eng,mat;
	private int aver;
	
	
	public Score() {}
	public Score(String name,int kor, int eng,int mat) {
		this.name=name;
		this.kor=kor;
		this.eng=eng;
		this.mat=mat;
		this.aver=(kor+eng+mat)/3;
		
	}
	
	
	public void disp() {
		
		String name="박지성";
		System.out.println(name);
		System.out.println(this.name);
		System.out.println(this.kor);
		System.out.println(this.eng);
		System.out.println(this.mat);
		System.out.println(this.aver);
	}
	
}



public class Test05_this {
  public static void main(String[] args) {
	  
	  /*
	  Score one=new Score();
	  one.disp();
	  
	  Score two=new Score("김연아", 90 , 85, 100);
	  two.disp();
	  */
	  
	  
	  /*
	  Score one=new Score("개나리",10,30,50);
	  Score two =new Score("진달래",20,35,55);
	  Score three=new Score("라일락",30,60,70);
	  
	  one.disp();
	  two.disp();
	  three.disp();
	  */
	  
	  Score[] sco= {
		new Score("개나리",10,30,50),
		new Score("진달래",20,35,55),
		new Score("라일락", 30,60,70)
	  };
	  
	  int size=sco.length;
	  
	  sco[0].disp();
	  sco[1].disp();
	  sco[2].disp();
	  
	  for(int i=0; i<size;i++) {
		  sco[i].disp();
	  }
	  

  }//main() end
}//class end
