package com.guitar;

public class Instrument implements Guitar, Piano {
	public void play() {       /*abstract method implemented here*/
		System.out.println(" Instrument is being played");
	}
}
