package org.joonzis.test;
interface Car{
	public void info();
}
class Bus implements Car{
	@Override
	public void info() {}
}
class CityTourBus extends Bus{
	@Override
	public void info() {
		System.out.println("시티 투어 버스");
	}
}
class SeoulBus extends Bus{
	@Override
	public void info() {
		System.out.println("서울 버스");
	}
}
class Taxi implements Car{
	@Override
	public void info() {
		System.out.println("택시");
	}
}
class Bicycle{
	
}
public class Test04 {
	static <T extends Car> void onlyCar(T car) {
		car.info();
	}
	
	public static void main(String[] args) {
		
		Car bus1 = new CityTourBus();
		Car bus2 = new SeoulBus();
		Car taxi = new Taxi();
		
		onlyCar(bus1);
		onlyCar(bus2);
		onlyCar(taxi);
		
		
	}
}
