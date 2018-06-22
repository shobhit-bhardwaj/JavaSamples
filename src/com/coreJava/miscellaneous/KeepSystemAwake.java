package com.coreJava.miscellaneous;

import java.awt.Robot;
import java.util.Random;

public class KeepSystemAwake {
	public static void main(String[] args) throws Exception {
		Robot hal = new Robot();
        Random random = new Random();
        while(true){
            hal.delay(1000 * 60);
            int x = random.nextInt() % 640;
            int y = random.nextInt() % 480;
            hal.mouseMove(x,y);
        }
	}
}