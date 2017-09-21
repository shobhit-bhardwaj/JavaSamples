package com.designPattern.structural.facade;

import com.designPattern.structural.facade.HelperFacade.DBType;
import com.designPattern.structural.facade.HelperFacade.ReportType;

public class TestFacade {
	public static void main(String[] args) {
		String tableName = "testtable";

		HelperFacade.generateTeport(DBType.MySQL, ReportType.HTML, tableName); 
		HelperFacade.generateTeport(DBType.MySQL, ReportType.PDF, tableName);
		System.out.println();

		HelperFacade.generateTeport(DBType.Oracle, ReportType.HTML, tableName);
		HelperFacade.generateTeport(DBType.Oracle, ReportType.PDF, tableName);
	}
}