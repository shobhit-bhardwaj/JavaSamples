package com.designPattern.structural.facade;

import java.sql.Connection;

public class HelperFacade {
	public static enum DBType {
		MySQL, Oracle
	}

	public static enum ReportType {
		HTML, PDF
	}

	public static void generateTeport(DBType dbType, ReportType reportType, String tableName) {
		Connection connection = null;

		switch (dbType) {
			case MySQL:
				MySQLHelper mySQLHelper = new MySQLHelper();
				connection = mySQLHelper.getMySQLConnection();
				switch (reportType) {
				case HTML:
						mySQLHelper.generateMySQLHTMLReport(tableName, connection);
						break;
					case PDF:
						mySQLHelper.generateMySQLPDFReport(tableName, connection);
						break;
					default:
						break;
				}
				break;
	
			case Oracle:
				OracleHelper oracleHelper = new OracleHelper();
				connection = oracleHelper.getOracleConnection();
				switch (reportType) {
				case HTML:
					oracleHelper.generateOracleHTMLReport(tableName, connection);
						break;
					case PDF:
						oracleHelper.generateOraclePDFReport(tableName, connection);
						break;
					default:
						break;
				}
				break;

			default:
				break;
		}
	}
}