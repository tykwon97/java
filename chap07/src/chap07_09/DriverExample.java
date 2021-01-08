package chap07_09;
/*
 * 실행 클래스 : 매개값의 자동 타입 변환과 메소드 오버라이딩을 이용해서 매개변수의 다형성을 구현   
 */
public class DriverExample {

	public static void main(String[] args) {
		Driver driver = new Driver();
		
		Bus bus = new Bus();
		Taxi taxi = new Taxi();
		
		driver.drive(bus); //자동 타입 변환 : Vehicle vehicle=bus;
		driver.drive(taxi);//자동 타입 변환 : Vehicle vehicle=taxi;

	}

}
