package com.coreJava.socket.multipleClients;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class TestClient {
	public static void main(String[] args) throws Exception {
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
	}
}