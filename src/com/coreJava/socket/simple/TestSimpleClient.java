package com.coreJava.socket.simple;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class TestSimpleClient {
	public static void main(String[] args) {
		try {
			Socket socket = new Socket("localhost", 6666);

			PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
			BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));

			String message = "Hello Server";
			out.println(message);
			String response = in.readLine();
			System.out.println("Response from Server - "+response);

			in.close();
			out.close();
			socket.close();
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
}