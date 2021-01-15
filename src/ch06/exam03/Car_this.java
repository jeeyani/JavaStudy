package ch06.exam03;

public class Car_this {
	
	String company="현대자동차";
	String model;
	String color;
	int maxSpeed;
	
	Car_this(){} //기본생성자 
	
	Car_this(String model){
		this(model,"은색",250);
	}
	
	Car_this(String model,String color){
		this(model,color,250);
	}
	
	Car_this(String model,String color,int maxSpeed){
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
}
