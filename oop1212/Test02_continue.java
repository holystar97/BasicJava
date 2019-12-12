package oop1212;

public class Test02_continue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for(int a=1; a<10;a++) {
			if(a==5) {
				break;
			}
			System.out.print(a + " ");
		}
		System.out.println();
		for(int a=1; a<10;a++) {
			if(a==5) {
				continue;
			}
			System.out.print(a+ " ");
		}
	}
}
