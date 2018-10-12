package com.designPattern.structural.decorator;

public class CNChannelPackage extends ChannelDecorator {
	public CNChannelPackage(SetaliteTV setaliteTV) {
		super(setaliteTV);
	}

	@Override
	public String show(int channelNo) {
		if(channelNo > 120 && channelNo <= 130)
			return "Enjoy Cartoons.";
		else
			return this.getSetaliteTV().show(channelNo);
	}

	@Override
	public int cost() {
		return this.getSetaliteTV().cost() + 10;
	}
}