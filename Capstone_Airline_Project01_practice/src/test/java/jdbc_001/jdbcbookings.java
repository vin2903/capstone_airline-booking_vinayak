
package jdbc_001;

import java.sql.Connection;
	import java.sql.DriverManager;
	import java.sql.ResultSet;
	import java.sql.SQLException;
	import java.sql.Statement;

	public class jdbcbookings {
		static Connection conn;
		public void jdbcbookingsmethod() {
		
		String conn_url = "jdbc:mysql://localhost:3306/flyaway";
		String UN = "root";
		String PWD = "root";

		conn = null;
		try {
			
			String qry2 = "select * from f_bookings where user_id = '4' ";
			conn = DriverManager.getConnection(conn_url, UN, PWD);
			Statement statement = conn.createStatement();
			
			 ResultSet resultSet2 = statement.executeQuery(qry2);
				
			 while (resultSet2.next()) {
	   				 String id_no1  = (resultSet2.getString("ID"));
	   				 String userid  = (resultSet2.getString("user_id"));
	   				 String flightid  = (resultSet2.getString("flight_id"));
	   				 String price  = (resultSet2.getString("price"));
	   				 String bookingdate  = (resultSet2.getString("booking_date"));
	   				 String flightdate  = (resultSet2.getString("flight_date"));


	   	   			 System.out.println("\n"+"--------------flight booking details from database data---------");
	   	   			 
	   	   			 System.out.println(" \n "+id_no1+" "+userid+" "+flightid+" "+price+" "+bookingdate+" "+flightdate);
	   			 
	   				
	   			 
			 }
		}
		
		 catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("donebookings");


	}
	}
