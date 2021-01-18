package chap09_04;
/*
 * �͸� �ڽ� ��ü ����
 */
public class AnonymousExample {

	public static void main(String[] args) {
		Anonymous anony = new Anonymous();
		//�͸� ��ü �ʵ� ���
		anony.field.wake();
		//�͸� ��ü ���� ���� ���
		anony.method1();
		//�͸� ��ü �Ű��� ���
		anony.method2(
				//�Ű� ��
				new Person()
				{
					void study() {
						System.out.println("�����սô�.");
					}

					@Override
					void wake() {
						System.out.println("8�ÿ� �Ͼ�ϴ�.");
						study();
					}
				}
		);
	}

}
