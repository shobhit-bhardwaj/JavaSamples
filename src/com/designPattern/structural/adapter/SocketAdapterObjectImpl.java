package com.designPattern.structural.adapter;

public class SocketAdapterObjectImpl implements SocketAdapter {
	private Socket socket = new Socket();

	@Override
	public Volt get120Volt() {
		return socket.getVolt();
	}

	@Override
	public Volt get12Volt() {
		int volts = socket.getVolt().getVolts()/10;
		return new Volt(volts);
	}

	@Override
	public Volt get3Volt() {
		int volts = socket.getVolt().getVolts()/40;
		return new Volt(volts);
	}
}