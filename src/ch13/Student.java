package ch13;

public class Student {

	public int no;
	public String name;

	public Student(int no, String name) {
		this.no = no;
		this.name = name;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Student) {
			Student s = (Student) obj;
			return (no == s.no) && (name.equals(s.name)); //학번과 이름이 같으면 동등객체로 취급
		} else {
			return false;
		}
	}

	@Override
	public int hashCode() {

		return no + name.hashCode();
	}

}
