package chap07_06;
/*
 * �ڵ� Ÿ�� ��ȯ ���� ��� ����
 */
public class ChildExample {

	public static void main(String[] args)
	{
		Child child = new Child();
		
		Parent parent = child; //�ڵ� Ÿ�� ��ȯ
		parent.method1();
		parent.method2(); //�����ǵ� �޼ҵ尡 ȣ���
		//parent.method3(); //ȣ�� �� ����
		
	}
}
