package chap08_06;
/*
 * ���ο� ���� Ŭ����
 */
public class MyClassB implements MyInterface{

	@Override
	public void method1()
	{
		System.out.println("MyClassB=method1() ����");
	}
	
	//default�޼ҵ� ������
	@Override
	public void method2()
	{
		System.out.println("MyClassB-method2() ����");
	}
}
