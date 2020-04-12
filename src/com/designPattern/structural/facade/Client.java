package com.designPattern.structural.facade;

import com.designPattern.structural.facade.HelperFacade.DBType;
import com.designPattern.structural.facade.HelperFacade.ReportType;

/*
 * Facade Design Pattern provide a unified interface to a set of interfaces in a subsystem.
 * Facade defines a higher-level interface that makes the subsystem easier to use.
 */
public class Client {
	public static void main(String[] args) {
		String tableName = "testtable";

		HelperFacade.generateTeport(DBType.MySQL, ReportType.HTML, tableName); 
		HelperFacade.generateTeport(DBType.MySQL, ReportType.PDF, tableName);
		System.out.println();

		HelperFacade.generateTeport(DBType.Oracle, ReportType.HTML, tableName);
		HelperFacade.generateTeport(DBType.Oracle, ReportType.PDF, tableName);
	}
}