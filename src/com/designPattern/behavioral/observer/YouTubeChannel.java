package com.designPattern.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class YouTubeChannel implements Subject {
	private String channelName;
	private List<Observer> subscribers = new ArrayList<>();

	public YouTubeChannel(String channelName) {
		this.channelName = channelName;
	}

	public String getChannelName() {
		return channelName;
	}

	@Override
	public void addObserver(Observer subscriber) {
		subscribers.add(subscriber);
	}

	@Override
	public void removeObserver(Observer subscriber) {
		subscribers.remove(subscriber);
	}

	@Override
	public void updateAndNotify(String content) {
		System.out.println(channelName + " - New Content is added - " + content);

		for(Observer subscriber : subscribers)
			subscriber.subscription(content);
	}
}