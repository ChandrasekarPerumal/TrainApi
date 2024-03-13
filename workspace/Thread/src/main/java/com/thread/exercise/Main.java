package com.thread.exercise;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 *
 * 
 */
public class Main {

	public static void main(String[] args) {
//		while (true) {
//			MutliThreadExample example = new MutliThreadExample();
//			example.start();
//		}

//		ExecutorService executorService=Executors.newSingleThreadExecutor();

		
		ExecutorService executorService = Executors.newFixedThreadPool(3);
		for (int i = 0; i < 4; i++) {
			executorService.execute(new ExecutorServiceExample(i));
		}
	}

}
