package com.designPattern.structural.facade;

import java.sql.Connection;

public class MySQLHelper {
	public Connection getMySQLConnection() {
		System.out.println("getMySQLConnection");
		return null;
	}

	public void generateMySQLHTMLReport(String tableName, Connection connection) {
		//	TO DO for HTML Report by MySQL.
		System.out.println("generateMySQLHTMLReport Called.");
	}

	public void generateMySQLPDFReport(String tableName, Connection connection) {
		//	TO DO for PDF Report by MySQL.
		System.out.println("generateMySQLPDFReport Called.");
	}
}