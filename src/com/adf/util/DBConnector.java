package com.adf.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class DBConnector {

	
	public static Connection getConnect() throws Exception{
		//메서드명 getConnect
		//Exception throws 
		String user="scott";
		String password="tiger";
		String url="jdbc:oracle:thin:@192.168.56.101:1521:xe";
		String driver="oracle.jdbc.driver.OracleDriver";
		
		Connection con=null;
		
		Class.forName(driver);
		con=DriverManager.getConnection(url, user, password);
		
		return con;
	}
}
//con=DBConnector.getConnect();
