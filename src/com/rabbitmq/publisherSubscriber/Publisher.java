package com.rabbitmq.publisherSubscriber;

import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;

public class Publisher {
	private static final String EXCHANGE_NAME = "testExchange";

	public static void main(String[] args) throws Exception {
		ConnectionFactory factory = new ConnectionFactory();
		factory.setHost("localhost");
		Connection connection = factory.newConnection();
		Channel channel = connection.createChannel();
		channel.exchangeDeclare(EXCHANGE_NAME, "fanout");

		String message = ("Test Publish Message");
		channel.basicPublish(EXCHANGE_NAME, "", null, message.getBytes());
		System.out.println("Message Send - "+message);

		channel.close();
		connection.close();
	}
}