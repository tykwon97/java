package chap06_10.package1;
/*
 * �������� ���� ����
 */
public class A {

	//�ʵ�
	A a1 = new A(true); //public ���� ����
	A a2 = new A(1); // default ���� ����
	A a3 = new A("���ڿ�"); // private ���� ����
	
	//������
	public A(boolean b) {}
	A(int b) {}
	private A(String S) {}
}
