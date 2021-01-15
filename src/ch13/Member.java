package ch13;

public class Member {

	public String name;
	public int age;

	public Member(String name, int age) {
		this.name = name;
		this.age = age;

	}

	@Override
	public int hashCode() {
		return name.hashCode()+age; //아이디가 동일하면 같은 해시코드를 리턴
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Member) {
			Member m = (Member) obj;
			return m.name.equals(name) && (m.age == age); //name과 age값이 같으면 true 리턴

		}
		return false;

	}

}
