package jdbc1231;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Test03_insert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Connection con=null;
		PreparedStatement pstmt=null;
		try {
			
			 String url     ="jdbc:oracle:thin:@localhost:1521:xe";
		      String user    ="system";
		      String password="1234";
		      String driver  ="oracle.jdbc.driver.OracleDriver";//ojdbc.jar  
		      Class.forName(driver);
		      con=DriverManager.getConnection(url, user, password);
		      System.out.println("오라클 DB 서버 연결 성공");
			
			StringBuilder sql=new StringBuilder();
			sql.append(" INSERT INTO sungjuk(sno,uname,kor,eng,mat,addr) ");
		    sql.append(" VALUES(sungjuk_seq.nextval,?,?,?,?,?) ");
		    
		      pstmt=con.prepareStatement(sql.toString());
		      pstmt.setString(1, "트럼프");
		      pstmt.setInt(2,99 );
		      pstmt.setInt(3,88 );
		      pstmt.setInt(4,85 );
		      pstmt.setString(5, "Seoul");
		      
		      int cnt=pstmt.executeUpdate();
		      if(cnt==0) {
		    	  System.out.println("행 추가 실패 !! ");
		      } else {
		    	  System.out.println("행 추가 성공 !! ");
		      }
		      
		      
		}catch(Exception e) {
			System.out.println("실패 : "+ e);
		}finally {
				try {
					if(pstmt!=null)
					pstmt.close();
					pstmt=null;
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				try {
					if(con!=null)
					con.close();
					con=null;
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
		}
		
		
	}

}
