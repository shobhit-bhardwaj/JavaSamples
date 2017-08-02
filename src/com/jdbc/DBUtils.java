package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DBUtils {
	static {
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

	public static Connection getConnection() {
		Connection connection = null;
		try {
			connection = DriverManager.getConnection("jdbc:mysql://localhost/test_db", "root", "root");
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return connection;
	}

	public static void closeResources(Object... resources) {
		for(Object resource : resources) {
			try {
				if(resource instanceof Connection)
					((Connection)resource).close();
				if(resource instanceof Statement)
					((Statement)resource).close();
				if(resource instanceof ResultSet)
					((ResultSet)resource).close();
			} catch(Exception ex) {
				ex.printStackTrace();
			}
		}
	}
}