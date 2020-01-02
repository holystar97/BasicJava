package jdbc0102;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Test04_selectName {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Connection con= null;
		PreparedStatement pstmt=null;
		//select 문 실행 시 반환 
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
		      sql.append(" SELECT sno, uname, aver, addr, wdate  ");
		      sql.append(" FROM sungjuk ");
		      sql.append(" ORDER BY sno DESC");
		      
		      pstmt=con.prepareStatement(sql.toString());
		      rs=pstmt.executeQuery();
		      if(rs.next()) {
		    	  System.out.println("자료 있음 ");
		    	  
		          do {
		              System.out.print(rs.getInt("sno") + " ");     
		              System.out.print(rs.getString("uname") + " ");
		              System.out.print(rs.getInt("aver") + " ");    
		              System.out.print(rs.getString("addr") + " "); 
		              System.out.print(rs.getString("wdate").substring(0,10) + " ");        
		              System.out.println();
		            }while(rs.next());
		          
		      }else {
		    	  System.out.println("자료 없음 ! ! ");
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
