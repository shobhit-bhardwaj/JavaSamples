package com.javaNewFeatures.java11;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileUtilities {
	public static void main(String[] args) throws Exception {
		Path filePath = Paths.get("mytxt.txt");
		String fileContent = Files.readString(filePath);
		System.out.println(fileContent);

		String newContent = fileContent.replace("line", "lineno ");
		filePath = Paths.get("mytxt-new.txt");
		Files.writeString(filePath, newContent);
	}
}