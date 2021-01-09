package chap08_07;
/*
 * 자식 인터페이스
 * 
 * ChildInterface3 인터페이스를 구현하는 클래스는 method1()과 method2(), method3()의 실체 메소드를 모두 가지고 있어야한다.
 */
public interface ChildInterface3 extends ParentInterface {
	@Override
	public void method2(); //추상 메소드로 재선언
	public void method3();

}
