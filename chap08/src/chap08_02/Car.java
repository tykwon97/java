package chap08_02;
/*
 * �ʵ� ������
 */
public class Car {
	//�������̽� Ÿ�� �ʵ� ����� �ʱ� ���� ��ü ����
	Tire frontLeftTire = new HankookTire();
	Tire frontRightTire = new HankookTire();
	Tire backLeftTire = new HankookTire();
	Tire backRightTire = new HankookTire();
	
	//�������̽����� ����� roll() �޼ҵ� ȣ��
	void run()
	{
		frontLeftTire.roll();
		frontRightTire.roll();
		backLeftTire.roll();
		backRightTire.roll();
	}
}
