package chap08_02;
/*
 * 필드 다형성 테스트
 */

public class CarExample_array {
	public static void main(String[] args)
	{
		Car_array myCar = new Car_array();

		myCar.run();

		myCar.tires[0] = new KumhoTire();
		myCar.tires[1] = new KumhoTire();

		myCar.run();	
	}

}
 