package com.designPattern.structural.decorator;

public class ESPNChannelPackage extends ChannelDecorator {
	public ESPNChannelPackage(SetaliteTV setaliteTV) {
		super(setaliteTV);
	}

	@Override
	public String show(int channelNo) {
		if(channelNo > 100 && channelNo <= 120)
			return "Enjoy Sports Channel.";
		else
			return this.getSetaliteTV().show(channelNo);
	}

	@Override
	public int cost() {
		return this.getSetaliteTV().cost() + 15;
	}
}