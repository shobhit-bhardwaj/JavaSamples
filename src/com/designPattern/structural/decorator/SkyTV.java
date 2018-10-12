package com.designPattern.structural.decorator;

public class SkyTV implements SetaliteTV {
	@Override
	public String show(int channelNo) {
		if(channelNo <= 100)
			return "Enjoy Basic Pack of Daily Soap.";
		else
			return "You Have No Subscription.";
	}

	@Override
	public int cost() {
		return 100;
	}
}