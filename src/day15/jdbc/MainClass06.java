package day15.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class MainClass06 {
	public static void main(String[] args) throws SQLException {
		Connection conn = null;
		// Statement 사용하지 말고 PreparedStatement 사용하자!!!
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			// 1. 드라이버 클래스 정보 로딩
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			// 2. 데이터베이스 연결
			String url ="jdbc:oracle:thin:@localhost:1521:xe";
			conn = DriverManager.getConnection(url, "hr", "hr");
			
			StringBuffer sql = new StringBuffer();
			sql.append("DELETE FROM sales_reps ");
			sql.append("WHERE id = ? ");
						
			pstmt = conn.prepareStatement(sql.toString());
			
			pstmt.setInt(1, 7);
			
			int result =  pstmt.executeUpdate();
			
			System.out.println("result : " + result);
			
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if(rs != null)rs.close();
			if(pstmt != null)pstmt.close();
			if(conn != null)conn.close();
		}
		
	}

}
