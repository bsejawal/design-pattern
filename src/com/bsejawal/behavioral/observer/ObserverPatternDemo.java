package com.bsejawal.behavioral.observer;

public class ObserverPatternDemo {

	public static void main(String[] args) {

		Subject subject = new Subject();

		new HexaObserver(subject);
		new OctalObserver(subject);
		new BinaryObserver(subject);

		System.out.println("First design_pattern.state change: 15");
		subject.setState(15);
		System.out.println("Second design_pattern.state change: 10");
		subject.setState(10);

	}

}
