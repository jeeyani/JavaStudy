package ch07.exam02;

public class Tire {

	public int max;
	public int accumulated;
	public String location;
	
	public Tire(String location, int max) {
		this.location = location;
		this.max = max;
	}
	

	public boolean roll() {
		++accumulated;
		
		if(max>accumulated) {
			System.out.println(location+" Tire 수명: "+(max-accumulated)+"회");
			return true;
		}else {
			System.out.println("*** "+location+" Tire 펑크 ***");
			return false;
		}
	}
	
}
