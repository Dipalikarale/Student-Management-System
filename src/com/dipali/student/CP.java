package com.dipali.student;


	import java.sql.*;
	public class CP {
		static Connection con;
		public static Connection createc() {
			
			try {
				
				//load the driver
				Class.forName("com.mysql.cj.jdbc.Driver");
				
				//create the Connection
				String user = "root"; //user of mysql
				String password = "root"; //password of mysql
				String url = "jdbc:mysql://localhost:3306/students";
				con = DriverManager.getConnection(url,user,password);
				
				
			}catch(Exception e) {
				e.printStackTrace();
			}
			return con;
			
		}
	}

	;
	