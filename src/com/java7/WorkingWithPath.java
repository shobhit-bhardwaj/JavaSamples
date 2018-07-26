package com.java7;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class WorkingWithPath {
	public static void main(String[] args) {
		Path path = Paths.get("c:\\Temp\\tempFile.txt");

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