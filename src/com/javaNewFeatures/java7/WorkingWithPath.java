package com.javaNewFeatures.java7;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class WorkingWithPath {
	public static void main(String[] args) {
		String filePath = "c:\\Temp\\tempFile.txt";
		Path path = Paths.get(filePath);

		System.out.println("Number of Nodes - " + path.getNameCount());
		System.out.println("File Name - " + path.getFileName());
		System.out.println("File Root - " + path.getRoot());
		System.out.println("File Parent - " + path.getParent());

		try {
			Files.delete(path);
			Files.deleteIfExists(path);
		} catch (IOException ex) {
			ex.printStackTrace();
		}
	}
}