package chap06_10.package1;
/*
 * �ʵ�� �޼ҵ��� ���� ����
 */
public class A_1 {

	//�ʵ�
	public int field1; //public ���� ����
	int field2; //default ���� ����
	private int field3; //private ���� ����

	//������
	public A_1() 
	{
		//Ŭ���� ������ ��� ���� �������� ������ ���� �ʴ´�.
		field1 = 1;
		field2 = 1;
		field3 = 1;
		
		
		method1();
		method2();
		method3();
	}
	
	//�޼ҵ�
	public void method1() {} //public ���� ����
	void method2() {} //default ���� ����
	private void method3() {} //private ���� ����
}
