package chap06_10.package1;
/*
 * �ʵ�� �޼ҵ��� ���� ����
 */
public class B_1 {
	
	public B_1()
	{
		A_1 a = new A_1();
		a.field1 = 1;
		a.field2 = 1;
		//a.field3 = 1; //private �ʵ� ���� �Ұ� (������ ����)
		
		
		a.method1();
		a.method2();
		//a.method3(); //private �޼ҵ� ���� �Ұ� (������ ����)
	}
}
