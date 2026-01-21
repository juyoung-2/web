package org.joonzis.test;
interface Providable{
	public void sightseeing();
	public void leisure();
	public void food();
}
class KoreaTour implements Providable{
	@Override
	public void sightseeing() {
		System.out.println("경복궁");
	}
	@Override
	public void leisure() {
		System.out.println("디스코 팡팡");
	}
	@Override
	public void food() {
		System.out.println("김치찌개");
	}
}
class GuamTour implements Providable{
	@Override
	public void sightseeing() {
		System.out.println("사랑의 절벽");
	}
	@Override
	public void leisure() {
		System.out.println("난파선 다이빙");
	}
	@Override
	public void food() {
		System.out.println("치킨 칼라구엔");
	}
}
class TourGuide{
	private Providable tour;
	public TourGuide() {}
	public TourGuide(Providable tour) {
		this.tour = tour;
	}
	public void sightseeing() {
		tour.sightseeing();
	}
	public void leisure() {
		tour.leisure();
	}
	public void food() {
		tour.food();
	}
}

public class Test02 {
	public static void main(String[] args) {
		
		TourGuide tour1 = new TourGuide(new KoreaTour());
		TourGuide tour2 = new TourGuide(new GuamTour());
		
		tour1.sightseeing();
		tour1.leisure();
		tour1.food();
		
		System.out.println("---------------");
		
		tour2.sightseeing();
		tour2.leisure();
		tour2.food();
	}
}
