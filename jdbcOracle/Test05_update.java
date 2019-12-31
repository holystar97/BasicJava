package jdbc1231;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Test05_update {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
		      
		      
			  StringBuilder sql=new StringBuilder();
			  sql.append("UPDATE sungjuk ");
			  sql.append("SET uname=? ");
			  sql.append(" , kor=? ");
			  sql.append(" , eng=? ");
			  sql.append(" , mat=? ");
			  sql.append(" WHERE sno=? ");
		
			  
			  

		      pstmt=con.prepareStatement(sql.toString());
		      // 쿼리문 변환 해주기
			  pstmt.setString(1, "김옥돌");
		      pstmt.setInt(2,98);
		      pstmt.setInt(3,87 );
		      pstmt.setInt(4,86 );
		      pstmt.setInt(5, 22);
			  
			
		      int cnt=pstmt.executeUpdate();
		      if(cnt==0) {
		    	  System.out.println("행 수정 실패 !! ");
		      } else {
		    	  System.out.println("행 수정 성공 !! ");
		      }
			
		}catch(Exception e) {
			System.out.println("실패 : "+ e);
		}finally {
			try {
				if(rs!=null)
				rs.close();
				rs=null;
			} catch (Exception e) {}
			
			try {
				if(pstmt!=null)
				pstmt.close();
				pstmt=null;
			} catch (Exception e) {}
			
			try {
				if(con!=null)
				con.close();
				con=null;
			} catch (Exception e) {}
		}
		
	}

}
