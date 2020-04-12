package com.designPattern.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class Composite implements Component {
	private String name;
	private List<Component> components = new ArrayList<>();

	public Composite(String name) {
		this.name = name;
	}

	public void addComponent(Component component) {
		components.add(component);
	}

	@Override
	public int showPrice() {
		System.out.println("Name - " + name);

		int price = 0;
		for(Component component : components)
			price += component.showPrice();

		return price;
	}
}