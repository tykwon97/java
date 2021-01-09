package chap08_02;
/*
 * 필드 다형성
 */
public class Car_array {
	//인터페이스 타입 필드 선언과 초기 구현 객체 대입
	Tire [] tires = {
			new HankookTire(),
			new HankookTire(),
			new HankookTire(),
			new HankookTire()
	};
	
	//인터페이스에서 설명된 roll() 메소드 호출
	void run()
	{
		for(Tire tire : tires) //tires에서 하나씩 tire에 대입
		{
			tire.roll();
		}
	}
}