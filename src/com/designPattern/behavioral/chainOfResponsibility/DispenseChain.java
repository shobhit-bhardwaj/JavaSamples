package com.designPattern.behavioral.chainOfResponsibility;

public interface DispenseChain {
	public void next(DispenseChain chain);
	public void dispense(Currency currency);
}