package com.designPattern.structural.composite;

/*
 * Composite Design Pattern compose objects into tree structures to represent whole-part hierarchies.
 * Composite lets clients treat individual objects and compositions of objects uniformly.
 */
public class Client {
	public static void main(String[] args) {
		Component monitor = new Leaf("Monitor", 8000);
		Component keyboard = new Leaf("Key Board", 700);
		Component mouse = new Leaf("Mouse", 400);

		Component ram = new Leaf("RAM", 3000);
		Component processor = new Leaf("Processor", 9000);

		Component hd = new Leaf("Hard Drive", 6000);

		Composite peripheral = new Composite("Peripheral");
		peripheral.addComponent(monitor);
		peripheral.addComponent(keyboard);
		peripheral.addComponent(mouse);

		Composite motherBoard = new Composite("Mother Board");
		motherBoard.addComponent(ram);
		motherBoard.addComponent(processor);

		Composite cabinate = new Composite("Cabinate");
		cabinate.addComponent(motherBoard);
		cabinate.addComponent(hd);

		Composite computer = new Composite("Computer");
		computer.addComponent(cabinate);
		computer.addComponent(peripheral);

		System.out.println("Total - " + computer.showPrice());
		//System.out.println(cabinate.showPrice());
		//System.out.println(motherBoard.showPrice());
		//System.out.println(peripheral.showPrice());
		//System.out.println(hd.showPrice());
	}
}