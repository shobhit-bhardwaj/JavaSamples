package com.javaNewFeatures.java7;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class TryWithResources {
	public static void main(String[] args) {
		try (
			FileInputStream inputStream = new FileInputStream("tmp.txt");
			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))
		) {
			inputStream.close();
			reader.close();
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
}