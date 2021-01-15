package ch07.exam01;

public class Student extends People {

	public int studentNo;
	
	
	public Student(String name, String ssn,int studentNo) { //자식의 생성자
		

		super(name,ssn);
		this.studentNo = studentNo;
	}
	
	
}
