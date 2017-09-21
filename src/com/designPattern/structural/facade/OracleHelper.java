package com.designPattern.structural.facade;

import java.sql.Connection;

public class OracleHelper {
	public Connection getOracleConnection() {
		System.out.println("getOracleConnection");
		return null;
	}

	public void generateOracleHTMLReport(String tableName, Connection connection) {
		//	TO DO for HTML Report by Oracle.
		System.out.println("generateOracleHTMLReport Called.");
	}

	public void generateOraclePDFReport(String tableName, Connection connection) {
		//	TO DO for PDF Report by Oracle.
		System.out.println("generateOraclePDFReport Called.");
	}
}