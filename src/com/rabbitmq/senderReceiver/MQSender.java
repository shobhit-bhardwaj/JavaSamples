package com.rabbitmq.senderReceiver;

import com.rabbitmq.client.Channel;

public class MQSender {
	private Channel channel;
	private String queueName;

	public MQSender(Channel channel, String queueName) {
		this.channel = channel;
		this.queueName = queueName;
	}

	public void sendMessage(String message) {
		try {
			channel.basicPublish("", queueName, null, message.getBytes());
			System.out.println("Message Send - "+message);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
}