package com.designPattern.structural.adapter;

public class SocketAdapterClassImpl extends Socket implements SocketAdapter {
	@Override
	public Volt get120Volt() {
		return getVolt();
	}

	@Override
	public Volt get12Volt() {
		int volts = getVolt().getVolts()/10;
		return new Volt(volts);
	}

	@Override
	public Volt get3Volt() {
		int volts = getVolt().getVolts()/40;
		return new Volt(volts);
	}
}