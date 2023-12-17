package com.promineotech;

import java.util.Random;

public class TestDemo {
	
	public int addPositive (int a, int b) {
		if (a > 0 || b > 0) {
			return a+b;
		}
		else {
			throw new IllegalArgumentException("Both parameters must be positive!");
		}
			
		
	}

	public int multiply(int a, int b) {
		return a * b;
	}
	
	public int randomNumberSquared() {
		int ranInt = getRandomInt();
		
		return ranInt*ranInt;
	}
	
	int getRandomInt() {
		Random random = new Random();
		return random.nextInt(10)+1;
	}

}
