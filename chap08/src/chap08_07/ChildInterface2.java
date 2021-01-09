package chap08_07;
/*
 * 자식 인터페이스
 * ChildInterface2 인터페이스를 구현하는 클래스는 method1()과 method3()의 실체 메소드를 가지고 있어야하며
 * ChildInterface2에서 재정의한 method2()를 호출할 수 있다.
 */
public interface ChildInterface2 extends ParentInterface {
	@Override
	public default void method2( ) { /*실행문*/ }
	
	public void method3();

}
