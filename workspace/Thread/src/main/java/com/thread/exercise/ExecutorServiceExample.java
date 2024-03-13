package com.thread.exercise;

public class ExecutorServiceExample extends Thread {

	private int count;
	
	public ExecutorServiceExample(int count) {
		this.count=count;
	}
	
	// Order of executing a thread : Un-Ordered
	public void run() {
		System.out.println("Started "+this.count);
		System.out.println("Done "+this.count);
	}
}
