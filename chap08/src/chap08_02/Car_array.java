package chap08_02;
/*
 * �ʵ� ������
 */
public class Car_array {
	//�������̽� Ÿ�� �ʵ� ����� �ʱ� ���� ��ü ����
	Tire [] tires = {
			new HankookTire(),
			new HankookTire(),
			new HankookTire(),
			new HankookTire()
	};
	
	//�������̽����� ����� roll() �޼ҵ� ȣ��
	void run()
	{
		for(Tire tire : tires) //tires���� �ϳ��� tire�� ����
		{
			tire.roll();
		}
	}
}