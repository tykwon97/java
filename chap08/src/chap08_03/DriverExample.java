package chap08_03;
/*
 * �Ű� ������ ������ �׽�Ʈ
 */
public class DriverExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Driver driver = new Driver();
		
		Bus bus = new Bus();
		Taxi taxi = new Taxi();
		
		driver.drive(bus); //�ڵ� Ÿ�� ��ȯ : Vehicle vehicle = bus;
		driver.drive(taxi); //�ڵ� Ÿ�� ��ȯ : Vehicle vehicle = taxi;

	}

}
