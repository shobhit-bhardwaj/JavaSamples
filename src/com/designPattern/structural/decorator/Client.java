package com.designPattern.structural.decorator;

/*
 * Decorator Design Pattern is used to add additional features or behaviors to a particular instance of a
 * class, while not modifying the other instances of same class.
 * 
 * Inheritance do the same thing but it binds the responsibility to sub class at compile time, it is static
 * binded. Decorators provide a flexible alternative to sub-classing for extending functionality.
 */
public class Client {
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