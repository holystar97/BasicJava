package jdbc1231;

import java.sql.DriverManager;

public class Test01_DBOpen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			//db 연결 정보 
			
			String url="jdbc:oracle:thin:@localhost:1521:xe";
			String user="system";
			String password="1234";
			String driver="oracle.jdbc.driver.OracleDriver";
			
			// 2 드라이버 로딩 
			Class.forName(driver);
			
			//3 오라클 db서버 연결
			DriverManager.getConnection(url,user,password);
			System.out.println("오라클 db 서버 연결 성공");
			
			
			
		}catch(Exception e) {
			System.out.println("오라클 DB 연결 실패 ");
		}
		
	}

}
