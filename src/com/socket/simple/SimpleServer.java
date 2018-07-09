package com.socket.simple;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class SimpleServer {
	public static void main(String[] args) {
		try {
			ServerSocket serverSocket = new ServerSocket(6666);
			Socket socket = serverSocket.accept();

			PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
			BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));

			String message;
			while((message = in.readLine()) != null) {
				System.out.println("Message from Client - "+message);
				String response = "Hello Client";
				out.println(response);
			}

			socket.close();
			serverSocket.close();
			in.close();
			out.close();
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
}