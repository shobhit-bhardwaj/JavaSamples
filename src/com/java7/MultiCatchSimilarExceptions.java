package com.java7;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MultiCatchSimilarExceptions {
	public static void main(String[] args) {
		try {
			FileInputStream inputStream = new FileInputStream(new File("temp.txt"));
			DriverManager.getConnection("jdbc:mysql://localhost/temp", "tempUser", "tempPassword");

			inputStream.close();
		} catch (IOException | SQLException ex) {
			System.err.println("Catching Both Exception Here.");
			ex.printStackTrace();
		}

		/*
		 * This code wont compile.
		 * As Exception's super class is mentioned, then no need to declare any of its sub class.
		 * 
		catch (IOException | FileNotFoundException ex) {
			System.err.println("Catching Both Exception Here.");
			ex.printStackTrace();
		}*/
	}
}