package chap06_10.package2;
/*
 * �ʵ�� �޼ҵ��� ���� ����
 */
import chap06_10.package1.A_1;

public class C_1 {
	public C_1()
	{
		A_1 a = new A_1();
		a.field1 = 1;
		//a.field2 = 1; // default �ʵ� ���� �Ұ�(������ ����)
		//a.field3 = 1; //private �ʵ� ���� �Ұ� (������ ����)
		
		
		a.method1();
		//a.method2(); // default �޼ҵ� ���� �Ұ�(������ ����)
		//a.method3(); //private �޼ҵ� ���� �Ұ� (������ ����)
	}
}
