package com.rabbitmq.senderReceiver;

import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;

public class MQEndPoint {
	private Channel channel = null;

	public MQEndPoint(String queueName) {
		ConnectionFactory factory = new ConnectionFactory();
		factory.setHost("localhost");
		try {
			Connection connection = factory.newConnection();
			channel = connection.createChannel();
			channel.queueDeclare(queueName, false, false, false, null);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

	public Channel getChannel() {
		return channel;
	}
}