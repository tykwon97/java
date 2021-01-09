package chap08_06;
/*
 * 기존 인터페이스
 */
public interface MyInterface {
	public void method1();
	
	//default 메소드 추가
	//구현 클래스에 꼭 들어갈 필요 없다.
	public default void method2()
	{
		System.out.println("MyInterface-method2 실행");
	}
}
