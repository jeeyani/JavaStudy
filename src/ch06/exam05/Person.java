package ch06.exam05;

public class Person {

	final String nation = "Korea";
	final String ssn;
	
	String name;
	
	//생산자
	public Person(String ssn, String name) {
		this.ssn = ssn;
		this.name = name;
	}
	
}
