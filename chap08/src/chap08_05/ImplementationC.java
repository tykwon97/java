package chap08_05;
/*
 * ���� �������̽� ����
 */
public class ImplementationC implements InterfaceC{

	//InterfaceA�� InterfaceB�� ��ü �޼ҵ尡 �־�� �Ѵ�.
	public void methodA()
	{
		System.out.println("ImplementationC-methodA() ����");
	}

	public void methodB()
	{
		System.out.println("ImplementationC-methodB() ����");
	}
	
	public void methodC()
	{
		System.out.println("ImplementationC-methodC() ����");
	}
}
