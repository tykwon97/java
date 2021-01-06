package chap07_04;
/*
 * super ����
 */
public class SupersonicAirplane extends Airplane
{
	public static final int NORMAL = 1; //����� ���� -> ������ �����ش�.
	public static final int SUPERSONIC = 2;
	
	public int flyMode = NORMAL;
	
	@Override
	public void fly() 
	{
		if(flyMode == SUPERSONIC)
			System.out.println("�����Ӻ����մϴ�.");
		else
			super.fly(); //Airplane ��ü�� fly() �޼ҵ� ȣ��
	}

}
