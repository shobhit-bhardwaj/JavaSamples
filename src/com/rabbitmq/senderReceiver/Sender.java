package com.rabbitmq.senderReceiver;

import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;

public class Sender {
	private static final String QUEUE_NAME = "testQueue";

	public static void main(String[] args) throws Exception {
		ConnectionFactory factory = new ConnectionFactory();
		factory.setHost("localhost");
		Connection connection = factory.newConnection();
		Channel channel = connection.createChannel();
		channel.queueDeclare(QUEUE_NAME, false, false, false, null);

		String message = "This is Test Message.";
		channel.basicPublish("", QUEUE_NAME, null, message.getBytes());
		System.out.println("Message Send - "+message);

		channel.close();
		connection.close();
	}
}