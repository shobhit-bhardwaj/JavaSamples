package com.socket.multipleClients;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

class ServerThread extends Thread {
	private Socket socket;

	public ServerThread(Socket socket) {
		this.socket = socket;
	}

	@Override
	public void run() {
		try {
			PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
			BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));

			String message;
			while((message = in.readLine()) != null) {
				System.out.println("Message from Client - "+message);
				String response = "Hello Client";
				out.println(response);
			}

			socket.close();
			in.close();
			out.close();
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
}

public class MultipleClientHandlerServer {
	public static void main(String[] args) throws Exception {
		ServerSocket serverSocket = new ServerSocket(6666);

		while(true)
			new ServerThread(serverSocket.accept()).start();
	}
}