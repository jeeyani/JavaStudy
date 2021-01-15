package ch07.exam02;

public class ChildExample2 {

	public static void main(String[] args) {
		
		//자동형변환
		Parent2 p = new Child2();
		p.field1="data1";
		p.method1();
		p.method2();
		
		//더 이상 자식타입을 사용하지 못하고 부모타입만 사용가능
		/*p.field2="data1";
		p.method3();*/
		
		//부모타입을 자식타입으로 강제형변환
		Child2 ch2 = (Child2) p;
		//부모, 자식 모두 사용가능해짐
		ch2.field2 ="data2";
		ch2.method3();
		
	}

}
