package com.desktop.app.test;

public class VolatileKey {

	volatile int volt = 0;

	public void display() {
		try {
			System.out.println(volt + 1);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void logic() {
		int a = 2; // 8421
		int b = 3;

		System.out.println(~a);
	}

	public void missingNumber() {
		int ar[] = { 1, 2, 4 };

		int tot = ((ar.length + 1) * (ar.length + 2)) / 2;
		
		int k = 0;
		
		for (int i = 0; i < 3; i++) {
			k=k ^ ar[i];
		}
		
		for(int i=1;i<=4;i++) {
			k=k^i;
		}

		System.out.println("Missing: " + k);
	}

	public static void main(String[] args) {
	
		VolatileKey key = new VolatileKey();

	}

}
