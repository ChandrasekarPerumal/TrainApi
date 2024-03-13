package com.desktop.app.test;

public class SampleException extends Exception {
	
	SampleException(){
		new Exception("Throwed");
	}

	public static void main(String[] args) {
		try {
		SampleException exception = new SampleException();
		System.out.println("Start");
		System.out.println("End");
		
		}catch (Exception e) {
			// TODO: handle exception
			e.getMessage();
		}
	}
	
}
