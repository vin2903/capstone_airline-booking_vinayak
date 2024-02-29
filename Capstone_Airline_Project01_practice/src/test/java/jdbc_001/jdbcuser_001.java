package jdbc_001;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class jdbcuser_001 {
	static Connection conn;
	public void jdbcusermethod() {
	
	String conn_url = "jdbc:mysql://localhost:3306/flyaway";
	String UN = "root";
	String PWD = "root";

	conn = null;
	try {
		String qry = "select * from f_user where name = 'sati' ";
		
		conn = DriverManager.getConnection(conn_url, UN, PWD);
		Statement statement = conn.createStatement();
		ResultSet resultSet = statement.executeQuery(qry);
		
		 while (resultSet.next()) {
			 String id_no  = (resultSet.getString("id"));
   			 String act_name  = (resultSet.getString("name"));
   			 String email_id = (resultSet.getString("email"));
   			 String datesignup  = (resultSet.getString("date_signup"));
   			 String addr  = (resultSet.getString("address"));
   			 String city_name  = (resultSet.getString("city"));
   			 String password  = (resultSet.getString("pwd"));
   			 
   			 
   			 
   			 
   			 System.out.println("\n"+"------user details from Database--------");
   			 
   			 System.out.println(" \n "+id_no+" "+act_name+" "+email_id+" "+datesignup+" "+addr+" "+city_name+" "+password);
		 }

	}
	
	 catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	System.out.println("user login details retrieved from database ");

	
	

}
}



