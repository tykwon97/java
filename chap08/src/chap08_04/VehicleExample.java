package chap08_04;
/*
 * 강제 타입 변환 + 객체 타입 확인
 */
public class VehicleExample {

	public static void main(String[] args) {

		Vehicle vehicle = new Bus();
		
		vehicle.run();
		//vehicle.checkFare(); //Vehicle 인터페이스에는 checkFare()가 없음
		if(vehicle instanceof Bus) //객체 타입 확인
		{
			Bus bus = (Bus) vehicle; //강제 타입 변환
			bus.run();
			bus.checkFare(); //Bus클래스에는 checkFare()가 있음
		}
		else
			System.out.println("Bus객체로 인터페이스 되어 있지않다.");
		

	}

}
