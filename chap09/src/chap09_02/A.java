package chap09_02;
/*
 * ��� Ŭ�������� ��� ����
 */
public class A {
	int field1;
	void method1() {}
	
	static int field2;
	static void method2() {}
	
	class B
	{
		void method()//��� �ʵ�� �޼ҵ忡 ������ �� �ִ�.
		{
			field1 = 10;
			method1();
			
			field2 = 10;
			method2();
		}
	}
	
	static class C
	{
		void method()
		{
			//�ν��Ͻ� �ʵ�� �޼ҵ�� ������ �� ����.
			//field1 = 10;
			//method1();
			
			field2 = 10;
			method2();
		}
	}

}
