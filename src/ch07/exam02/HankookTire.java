package ch07.exam02;

public class HankookTire extends Tire {

	public HankookTire(String location, int max) {
		super(location, max);
	}

	@Override
	public boolean roll() {
		++accumulated;

		if (max > accumulated) {
			System.out.println(location + " 한국Tire 수명: " + (max - accumulated) + "회");
			return true;
		} else {
			System.out.println("*** " + location + " 한국Tire 펑크 ***");
			return false;
		}
	}

}
