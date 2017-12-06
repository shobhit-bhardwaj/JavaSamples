package com.rabbitmq.senderReceiver;

import com.rabbitmq.client.Channel;

public class Test {
	public static void main(String[] args) {
		String queueName = "testQueue";

		MQEndPoint endPoint = new MQEndPoint(queueName);
		Channel channel = endPoint.getChannel();
		MQSender sender = new MQSender(channel, queueName);
		sender.sendMessage("Sending Sample Message");

		MQReciever reciever = new MQReciever(channel, queueName);
		reciever.recieveMessage();
	}
}