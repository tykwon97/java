package chap08_07;
/*
 * �ڽ� �������̽�
 * 
 * ChildInterface3 �������̽��� �����ϴ� Ŭ������ method1()�� method2(), method3()�� ��ü �޼ҵ带 ��� ������ �־���Ѵ�.
 */
public interface ChildInterface3 extends ParentInterface {
	@Override
	public void method2(); //�߻� �޼ҵ�� �缱��
	public void method3();

}
