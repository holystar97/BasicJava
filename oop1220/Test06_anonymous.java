package oop1220;


interface IMessage{
	public void msgPrint();
} // interface end 

class Message implements IMessage{
	@Override
	public void msgPrint() {
		// TODO Auto-generated method stub
		System.out.println("message 클래스");
	}
}

public class Test06_anonymous {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		IMessage msg= new IMessage();
		
		
		Message msg=new Message();
		msg.msgPrint();
		
		IMessage imess=new IMessage() {
			@Override
			public void msgPrint() {
				// TODO Auto-generated method stub
				System.out.println("Anonymous 익명 내부 클래스");
			}
		};
		imess.msgPrint();
		
		
		
		
	}

}
