package chap07_10;
/*
 * ���� Ÿ�� ��ȯ(ĳ����)
 */
public class ChildExample {

	public static void main(String[] args) {
		Parent parent = new Child(); //�ڵ� Ÿ�� ��ȯ
		parent.field1 = "data1";
		parent.method1();
		parent.method2();
		
		/*
		 parent.field2 = "data2"; //�Ұ���
		 parent.method3(); //�Ұ���
		 */
		
		Child child = (Child) parent; //���� Ÿ�� ��ȯ
		child.field2 = "yyy"; //����
		child.method3(); //����

	}

}
