package oop1219;
import oop1219.Test07_jumin;

public class Jumin {
	private String jumin;
	public Jumin() {}
	public Jumin(String jumin) {
		this.jumin=jumin;
	}

	public boolean validate() {
		
		//주민번호가 유효한지 검증하고 
		//유효하면 true 리턴 
		boolean flag=false;
		
		int hap=0;
		
		for(int i=0; i<jumin.length();i++) {
			char ch=jumin.charAt(i);
		}
		String juNum=jumin.substring(0,9);
		System.out.println(juNum);
		
		for(int i=0; i<juNum.length(); i++){
			hap = 0;
		char ch =juNum.charAt(i);
		for(int k=2; k<=9; k++){
			hap = hap + (Character.getNumericValue(ch)*k);
			System.out.println(hap);
		}
		}

		return true;
		
		
	} // validate() 
	
	public void disp() {
		
		//생년월일 , 성별, 나이, 띠 출력하기 
		// 띠 : 태어난 년도 %12
		// ->0 원숭이 1 닭 2 개 ~ ~ 11양 
		
		
	} // disp() end 
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
