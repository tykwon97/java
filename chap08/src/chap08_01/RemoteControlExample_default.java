package chap08_01;
/*
 * ����Ʈ �޼ҵ� ��� + ���� �޼ҵ� ���
 */
public class RemoteControlExample_default {

	public static void main(String[] args) {
		//�������̽� ���� ����
		RemoteControl rc = null;

		//Television ��ü�� �������̽� Ÿ�Կ� ����
		rc = new Television();
		//�������̽��� turnOn(), turnOff()ȣ��
		rc.turnOn();
		rc.setMute(true);

		//Audio ��ü�� �������̽� Ÿ�Կ� ����
		rc = new Audio();
		//�������̽��� turnOn(), turnOff()ȣ��
		rc.turnOn();
		rc.setMute(true);
		
		//------------------ ���� �޼ҵ� ��� ------------------------------
		//���� �޼ҵ� ��� -> �������̽��� �ٷ� ȣ�� ����	
		RemoteControl.changeBattery(); 
	}

}

