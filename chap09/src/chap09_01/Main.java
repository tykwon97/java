package chap09_01;
/*
 * ��ø Ŭ���� ��ü ����
 */
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a = new A();
		
		//�ν��Ͻ� ��� Ŭ���� ��ü ����
		A.B b = a.new B();
		b.field1 = 3;
		b.method1();
		
		//���� ��� Ŭ���� ��ü ����
		A.C c = new A.C();
		c.field1 = 3;
		c.method1();
		A.C.field2 = 3;
		A.C.method2();
		
		//���� Ŭ���� ��ü ������ ���� �޼ҵ� ȣ��
		a.method();
	}
}
