package com.desktop.app.test;

import java.util.ArrayList;
import java.util.List;

public class PrimeNum {

	static void primeNumber(int num) {

//		prime number -
		List<Integer> lop = new ArrayList<>();

		int i = 2;

		while (true ) {
			boolean flag = false;
			
			
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					flag = true;
				}
			}
			

			if (!flag) {
				lop.add(i);
			}

			if (num <= lop.size()) {
				break;
			}
			
			i++;
		}

		
		for (int j = 0; j< lop.size(); j++) {
			System.out.println("Index:" + j + " value:" + lop.get(j));
		}

	}

	public static void main(String[] args) {

		try {
			primeNumber(100);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
