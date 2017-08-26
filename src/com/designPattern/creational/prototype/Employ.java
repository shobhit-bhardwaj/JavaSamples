package com.designPattern.creational.prototype;

import java.util.ArrayList;
import java.util.List;

public class Employ {
	private List<String> employList;

	public Employ() {
	}

	public List<String> getEmployList() {
		return employList;
	}

	public void setEmployList(List<String> employList) {
		this.employList = employList;
	}

	public void loadData() {
		employList = new ArrayList<>();

		employList.add("AAA");
		employList.add("BBB");
		employList.add("CCC");
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		List<String> employs = new ArrayList<>();
		for(String name : this.employList)
			employs.add(name);

		Employ employ = new Employ();
		employ.setEmployList(employs);
		return employ;
	}
}