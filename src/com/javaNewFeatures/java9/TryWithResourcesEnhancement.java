package com.javaNewFeatures.java9;

import java.io.FileInputStream;
import java.io.IOException;

public class TryWithResourcesEnhancement {
	public static void main(String[] args) throws IOException {
		FileInputStream inputStream = new FileInputStream("tmp.txt");
		try (inputStream) {
			inputStream.close();
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
}