package chap08_07;
/*
 * �ڽ� �������̽�
 * ChildInterface2 �������̽��� �����ϴ� Ŭ������ method1()�� method3()�� ��ü �޼ҵ带 ������ �־���ϸ�
 * ChildInterface2���� �������� method2()�� ȣ���� �� �ִ�.
 */
public interface ChildInterface2 extends ParentInterface {
	@Override
	public default void method2( ) { /*���๮*/ }
	
	public void method3();

}
