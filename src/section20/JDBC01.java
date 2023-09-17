package section20;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/*
 * JDBC(JAVA DataBase Connectivity)
 * 	자바 어플리케이션에서 데이터 베이스와 통신할 수 있는 API
 */

public class JDBC01 {
	public static void main(String[] args) {
		Connection conn  = null;
		Statement stmt = null;
		ResultSet rs = null;
		
		try {
			
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			String url = "jdbc:oracle:thin:@localhost:21521:xe";
			conn = DriverManager.getConnection(url, "hr", "hr");
			
			stmt = conn.createStatement();
			
			String sql = "SELECT * FROM employees WHERE department_id = 30";
			
			rs = stmt.executeQuery(sql);
			
			while(rs.next()) {
				String employeeId = rs.getString("employee_id");
				String lastName = rs.getString("last_name");
				String firstName = rs.getString("first_name");
				String salary = rs.getString("salary");
				
				System.out.println(employeeId+"/"+ lastName + "/" + firstName +"/" + salary);
			}
			
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			
			try {
				if(rs != null) rs.close();
				if(stmt != null) stmt.close();
				if(conn != null) conn.close();
				
			}catch (Exception e) {
				e.printStackTrace();
			} 
		}
		
		
	}

}




