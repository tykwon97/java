package chap07_07;
/*
 * 실행 클래스
 */
public class CarExample {

	public static void main(String[] args) {
		Car car = new Car(); //Car객체 생성
		
		for(int i=1; i<=5; i++)
		{
			int problemLocation = car.run();
			
			switch(problemLocation)
			{
			case 1:
				System.out.println("앞왼쪽 HankookTire로 교체");
				car.frontLeftTire = new HankookTire("앞왼쪽",15);
				break;
			case 2:
				System.out.println("앞오른쪽 KumhoTire로 교체");
				car.frontRightTire = new KumhoTire("앞왼쪽",15);
				break;
			case 3:
				System.out.println("뒤왼쪽 HankookTire로 교체");
				car.backLeftTire = new HankookTire("앞왼쪽",15);
				break;
			case 4:
				System.out.println("뒤오른쪽 KumhoTire로 교체");
				car.backRightTire = new KumhoTire("앞왼쪽",15);
				break;
			}
			System.out.println("---------------------------------");//1회전 시 출력되는 내용을 구분
		}

	}

}
