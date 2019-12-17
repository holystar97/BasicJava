package oop1217;

class School{
  //멤버변수 field
  private String name;
  private int kor, eng, mat;
  private int aver;
  
  //생성자 함수 Constructor
  //->클래스명과 동일한 함수
  //->생성자함수는 리턴형이 올수 없다
  //public void School() {}
  public School() { //기본생성자함수
                    //default constructor
                    //자동생성된다
    System.out.println("School()...");    
  }
  
  //생성자함수도 오버로딩(중복정의)이 가능하다
  public School(String n) {
	  name=n;
  }
  
  public School(int k, int e, int m) {
	  kor=k;
	  eng=e;
	  mat=m;
  }
  public School(String n,int k, int e, int m) {
	  name=n;
	  kor=k;
	  eng=e;
	  mat=m;
  }
  
  //멤버 함수 method
  
  public void calc() {
	  aver=(kor+eng+mat)/3;
  }
  public void disp() {
	  
	  System.out.println(name);
	  System.out.println(kor);
	  System.out.println(eng);
	  System.out.println(mat);
	  System.out.println(aver);
  }
}//class end



public class Test04_constructor {

  public static void main(String[] args) {

    School one=new School();
	one.calc();
	one.disp();
	
	School two=new School("김연아");
	two.calc();
	two.disp();
	
	School three= new School(100, 85, 90);
	three.calc();
	
	School four=new School("무궁화", 20,30,40);
	four.calc();
	four.disp();
    
  }//main() end
}//class end
