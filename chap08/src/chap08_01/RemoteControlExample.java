package chap08_01;
/*
 * �������̽� ������ ���� ��ü ����
 * ���� ��ü�� �������̽� ������ �����ؼ� ���
 * 
 * �������̽� ���!!
 */
public class RemoteControlExample {

	public static void main(String[] args) {
		//�������̽� ���� ����
		RemoteControl rc = null;

		//Television ��ü�� �������̽� Ÿ�Կ� ����
		rc = new Television();
		//�������̽��� turnOn(), turnOff()ȣ��
		rc.turnOn();
		rc.turnOff();

		//Audio ��ü�� �������̽� Ÿ�Կ� ����
		rc = new Audio();
		//�������̽��� turnOn(), turnOff()ȣ��
		rc.turnOn();
		rc.turnOff();
	}

}
