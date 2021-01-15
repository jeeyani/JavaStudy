package ch07.exam01;

public class StudentExample {

	public static void main(String[] args) {
		
		Student s = new Student("박지연", "990522-2000000", 1212164);
		
		System.out.println("name: "+s.name);
		System.out.println("주민번호: "+s.ssn);
		System.out.println("학번: "+s.studentNo);
	}

}
