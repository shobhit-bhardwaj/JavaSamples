package com.designPattern.structural.decorator;

public abstract class ChannelDecorator implements SetaliteTV {
	private SetaliteTV setaliteTV;

	public ChannelDecorator(SetaliteTV setaliteTV) {
		this.setaliteTV = setaliteTV;
	}

	public SetaliteTV getSetaliteTV() {
		return setaliteTV;
	}
}