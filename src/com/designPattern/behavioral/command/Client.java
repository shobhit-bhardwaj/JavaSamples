package com.designPattern.behavioral.command;

/*
 * The Command Design Pattern is a behavioral design pattern in which an object is used to encapsulate all information needed to perform an
 * action, a business operation or trigger an event e.g. method name, receiver object reference and method parameter values, if any.
 * This object is called command.
 * 
 * The similar approach is adapted into chain of responsibility pattern as well. Only difference is that in command there is one request handler
 * and in chain of responsibility there can be many handlers for single request object.
 */
public class Client {
	public static void main(String[] args) {
		Light light = new Light();
		LightOnCommand lightOnCommand = new LightOnCommand(light);
		LightOffCommand lightOffCommand = new LightOffCommand(light);

		Fan fan = new Fan();
		FanStartCommand fanStartCommand = new FanStartCommand(fan);
		FanStopCommand fanStopCommand = new FanStopCommand(fan);

		Curtain curtain = new Curtain();
		CurtainUpCommand curtainUpCommand = new CurtainUpCommand(curtain);
		CurtainDownCommand curtainDownCommand = new CurtainDownCommand(curtain);

		RemoteControl remoteControl = new RemoteControl(3);
		remoteControl.registerDevice(0, lightOnCommand, lightOffCommand);
		remoteControl.registerDevice(1, fanStartCommand, fanStopCommand);
		remoteControl.registerDevice(2, curtainUpCommand, curtainDownCommand);

		remoteControl.onClicked(0);
		remoteControl.offClicked(0);

		remoteControl.onClicked(1);
		remoteControl.offClicked(1);

		remoteControl.onClicked(2);
		remoteControl.offClicked(2);
	}
}