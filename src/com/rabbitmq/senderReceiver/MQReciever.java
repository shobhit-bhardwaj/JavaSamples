package com.rabbitmq.senderReceiver;

import java.io.IOException;

import com.rabbitmq.client.AMQP;
import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Consumer;
import com.rabbitmq.client.DefaultConsumer;
import com.rabbitmq.client.Envelope;

public class MQReciever {
	private Channel channel;
	private String queueName;

	public MQReciever(Channel channel, String queueName) {
		this.channel = channel;
		this.queueName = queueName;
	}

	public void recieveMessage() {
		try {
			Consumer consumer = new DefaultConsumer(channel) {
				@Override
				public void handleDelivery(String consumerTag, Envelope envelope, AMQP.BasicProperties properties, byte[] body) throws IOException {
					String message = new String(body, "UTF-8");
					System.out.println("Message Recieve - "+message);
				}
			};

			channel.basicConsume(queueName, true, consumer);

			System.out.println("Waiting for messages. To exit press CTRL+C");
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
}