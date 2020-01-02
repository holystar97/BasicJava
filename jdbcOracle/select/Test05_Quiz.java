package jdbc0102;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Test05_Quiz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//문제 ) 수강 신청 학점이 제일 많은 학생의 학번, 이름 ,총학점 출력하기
		Connection con=null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		
		try {
			 String url     ="jdbc:oracle:thin:@localhost:1521:xe";
		      String user    ="system";
		      String password="1234";
		      String driver  ="oracle.jdbc.driver.OracleDriver";//ojdbc.jar  
		      Class.forName(driver);
		      con=DriverManager.getConnection(url, user, password);
		      System.out.println("오라클 DB 서버 연결 성공");
		   
		      
		      String where="";
		      where=where+ "WHERE "+"tot >=100 ";
		     
		      
		      StringBuilder sql=new StringBuilder();
		      sql.append(" SELECT sno,uname,tot ");
		      sql.append(" FROM sungjuk");
		      sql.append(where);
		      
		      pstmt=con.prepareStatement(sql.toString());
		      rs=pstmt.executeQuery();
			
		      
		      
		      
		      
		      
		}catch(Exception e) {
			 System.out.println("실패:"+e);
		}finally{
			try {
		        if(rs!=null) {rs.close(); rs=null; }
		      }catch (Exception e) {}

		      try {
		        if(pstmt!=null) {pstmt.close(); pstmt=null; }
		      }catch (Exception e) {}
		      
		      try {
		        if(con!=null) {con.close(); con=null; }
		      }catch (Exception e) {} 
			
		}
		
		
	}

}
