package oop1219;
import oop1219.Jumin;

public class Test07_jumin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 주민번호 유효성 검사후 
		
		Jumin id=new Jumin("9595959");
		if(id.validate()) {
			System.out.println("주민번호 맞아요 ");
			//id.disp();
		}else {
			System.out.println("잘못된 주민번호 입니다.");
		}
		
		
		// 생년월일, 성별, 나이 , 띠 출력하기
		
		// 나머지가 0이 나오면 원숭이 
		
		
		int arr[]=new int[13];
		int n=Integer.parseInt(id.toString());
		
		
		
		
	} 

}
