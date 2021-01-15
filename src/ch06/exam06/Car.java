package ch06.exam06;

import ch06.exam06.hankook.*;
import ch06.exam06.hyundai.*;
import ch06.exam06.kumho.*;

public class Car {
	Engine e = new Engine();
	SnowTire ti1 = new SnowTire();
	BigWidthTire ti2 = new BigWidthTire();

	//각자 다른 패키지에서 불러왔지만 클래스의 이름이 같은 경우, 직접 경로를 입력하여 변수를 선언해줘야한다
	ch06.exam06.hankook.Tire ti3 = new ch06.exam06.hankook.Tire();
	ch06.exam06.kumho.Tire ti4 = new ch06.exam06.kumho.Tire();
}
