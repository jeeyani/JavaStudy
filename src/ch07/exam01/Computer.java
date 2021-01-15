package ch07.exam01;

public class Computer extends Calculator {

	@Override
	double areaCircle(double r) {
		System.out.println("areaCircle메소드 재정의");

		return Math.PI*r*r;
	}
	
}
