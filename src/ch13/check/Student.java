package ch13.check;

public class Student {

	public int studentNum;
	public String name;

	public Student(int studentNum, String name) {
		this.studentNum = studentNum;
		this.name = name;
	}

	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof Student)) {
			return false;
		}
		
		Student s = (Student) obj;
		
		if(studentNum !=s.studentNum) {
			return false;
		}
		
		return true;
	}

	@Override
	public int hashCode() {

		return studentNum;
	}

}
