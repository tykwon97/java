package chap07_05;
/*
 * �������� �� ���� final �޼ҵ�
 */
public class SportsCar extends Car {

	@Override
	public void speedUp() { speed += 10; }
	
	//�������̵��� �� �� ����
	
	/*
	@Override
	public void stop() {
		System.out.println("������ī�� ����");
		speed = 0;
	}
	*/
}
