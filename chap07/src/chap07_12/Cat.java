package chap07_12;
/*
 * 추상 메소드 오버라이딩
 */
public class Cat extends Animal{
	public Cat()
	{
		this.kind = "포유류";
	}
	
	//추상 메소드 재정의
	@Override
	public void sound()
	{
		System.out.println("야옹");
	}

}
