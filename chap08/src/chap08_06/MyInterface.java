package chap08_06;
/*
 * ���� �������̽�
 */
public interface MyInterface {
	public void method1();
	
	//default �޼ҵ� �߰�
	//���� Ŭ������ �� �� �ʿ� ����.
	public default void method2()
	{
		System.out.println("MyInterface-method2 ����");
	}
}
