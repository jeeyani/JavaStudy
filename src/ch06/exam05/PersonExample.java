package ch06.exam05;

public class PersonExample {

	public static void main(String[] args) {
		
		Person p = new Person("123456-1234567", "홍길동");
		
		System.out.println(p.nation);
		System.out.println(p.ssn);
		System.out.println(p.name);
		
		p.name ="홍삼원";

	}

}
