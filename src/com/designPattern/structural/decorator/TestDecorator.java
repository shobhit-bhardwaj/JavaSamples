package com.designPattern.structural.decorator;

public class TestDecorator {
	public static void main(String[] args) {
		System.out.println("Full Subscription -");
		SetaliteTV setaliteTV = new ESPNChannelPackage(new CNChannelPackage(new SkyTV()));
		System.out.println("Channel Message - " + setaliteTV.show(125));
		System.out.println("Subscription Price - " + setaliteTV.cost());
		System.out.println();

		System.out.println("Sports Subscription -");
		setaliteTV = new ESPNChannelPackage(new SkyTV());
		System.out.println("Channel Message - " + setaliteTV.show(115));
		System.out.println("Subscription Price - " + setaliteTV.cost());
		System.out.println();

		System.out.println("Base Subscription -");
		setaliteTV = new SkyTV();
		System.out.println("Channel Message - " + setaliteTV.show(80));
		System.out.println("Subscription Price - " + setaliteTV.cost());
	}
}