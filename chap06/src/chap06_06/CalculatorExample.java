package chap06_06;

//메소드 오버로딩

public class CalculatorExample {

	public static void main(String[] args) {
		Calculator myCalcu = new Calculator();
		
		//정사각형의 넓이 구하기
		double result1 = myCalcu.areaRectangel(10);
		
		//직사각형의 넓이 구하기
		double result2 = myCalcu.areaRectangel(10,20);
		
		//결과 출력
		System.out.println("정사각형의 넓이 : "+result1);
		System.out.println("직사각형의 넓이 : "+result2);
	}

}
