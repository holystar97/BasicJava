package oop1217;


class Jumsu{
	
	private int no; // 번호 
	private String name; // 이름 
	public int score; // 점수 
	public int rank; // 등수 
	
	private char[] ox=new char[5]; // ox표시 
	private int[] answer=new int [5]; // 답안제출 
	
	public Jumsu() {}
	public Jumsu(int no, String name, int a0, int a1, int a2, int a3, int a4) {
		
		this.no=no;
		this.name=name;
		this.answer[0]=a0;
		this.answer[1]=a1;
		this.answer[2]=a2;
		this.answer[3]=a3;
		this.answer[4]=a4;
		this.rank=1;
		
	}
	
	public void compute() {
		
		//정답과 제출한 answer 답안을 비교해서 
		// ox를 구하고 , 맞은 개수에 따라 점수를 구하기
		
		int[] dap= {1,1,1,1,1}; // 정답 
		
		for(int i=0; i<answer.length;i++) {
			if(answer[i]==dap[i]) {
				ox[i]='O';
				score+=20;
			}
			else {
				ox[i]='X';
			}
			
		}
	
	}
	
	public void disp() {
		
		System.out.print(no +" ");
		System.out.print(name+ " ");
		System.out.print(ox[0]+" ");
		System.out.print(ox[1]+ " ");
		System.out.print(ox[2]+ " ");
		System.out.print(ox[3]+ " ");
		System.out.print(ox[4]+ " ");
		System.out.print(score+ " ");
		System.out.print(rank+ " ");
		System.out.println();
		
	}
	
	

}



public class Test06_OX {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Jumsu[] student= {
				new Jumsu(1,"김옥돌",1,2,1,1,1),
				new Jumsu(2,"나오돌",1,1,1,1,1),
				new Jumsu(3,"다옥돌",3,2,4,2,1),
				new Jumsu(4,"라옥돌",2,1,4,1,1),
				new Jumsu(5,"마옥돌",1,1,4,3,2)
	
		};
		
		int size=student.length;
		
		//ox 점수 계산하기 
		for(int i=0; i<size; i++) {
			student[i].compute();
		}
		
		// 등수구하기 (score를 기준으로 )
		
		for (int i = 0; i < size; i++)
		{
			for (int j = 0; j <size; j++)
			{
				if (student[i].score < student[j].score) student[i].rank++;	
			}
		}
		
		
		// 출력하기 
	
		for(int i=0; i<size; i++) {
			student[i].disp();
		}
		
	}
}
