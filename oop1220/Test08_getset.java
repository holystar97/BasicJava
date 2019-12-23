package oop1220;

class Member{
	
	private String id;
	private String password;
	
	public void setId(String id) {
		this.id=id;
	}
	
	public String getId() {
		return this.id;
	}
	
	public void setPassword(String password) {
		this.password=password;
		
	}
	public String getPassword() {
		return this.password;
	}
	
}


public class Test08_getset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Member mem=new Member();
		mem.setId("okdol");
		mem.setPassword("12345");
		
		System.out.println(mem.getId());
		System.out.println(mem.getPassword());
		
		
		
		
	}

}
