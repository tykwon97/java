package chap07_03;
/*
 * 자식 클래스
 */
public class Computer extends Calculator {
	@Override //어노테이션
	double areaCircle(double r)
	{
		System.out.println("Computer 객체의 areaCircle() 실행");
		return Math.PI * r * r;
		//Math.PI 는 자바 표준 API로 정확한 계산 가능
	}

}
