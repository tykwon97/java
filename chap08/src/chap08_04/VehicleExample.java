package chap08_04;
/*
 * ���� Ÿ�� ��ȯ + ��ü Ÿ�� Ȯ��
 */
public class VehicleExample {

	public static void main(String[] args) {

		Vehicle vehicle = new Bus();
		
		vehicle.run();
		//vehicle.checkFare(); //Vehicle �������̽����� checkFare()�� ����
		if(vehicle instanceof Bus) //��ü Ÿ�� Ȯ��
		{
			Bus bus = (Bus) vehicle; //���� Ÿ�� ��ȯ
			bus.run();
			bus.checkFare(); //BusŬ�������� checkFare()�� ����
		}
		else
			System.out.println("Bus��ü�� �������̽� �Ǿ� �����ʴ�.");
		

	}

}
