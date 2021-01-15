package ch07.exam01.pack2;

import ch07.exam01.pack01.*;

public class D extends A{

	public D() {
		super(); //직접호출할 수 없어서 super을 사용해야함
		this.field = "value";
		this.method();
	}
	
	
}
