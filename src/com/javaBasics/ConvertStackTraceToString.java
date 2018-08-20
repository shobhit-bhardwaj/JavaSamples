package com.javaBasics;

import java.io.File;
import java.io.FileInputStream;
import java.io.PrintWriter;
import java.io.StringWriter;

public class ConvertStackTraceToString {
	public static void main(String[] args) {
		try {
			FileInputStream inputStream = new FileInputStream(new File("abc.txt"));
			inputStream.close();
		} catch (Exception ex) {
			StringWriter stringWriter = new StringWriter();
			PrintWriter printWriter = new PrintWriter(stringWriter);
			ex.printStackTrace(printWriter);

			System.out.println("Exception - " + stringWriter);
		}
	}
}