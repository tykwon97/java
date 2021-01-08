package chap07_07;
/*
 * Tire�� �ڽ� Ŭ����
 */
public class HankookTire extends Tire {
	//�ʵ�
	//������
	
	public HankookTire(String location, int maxRotation)
	{
		super(location,maxRotation);
	}
	
	//�޼ҵ�
	//��� ������ �޸��ϱ� ���� ������(�������̵�)�� roll()�޼ҵ�
	@Override
	public boolean roll()
	{
		++accumulatedRotation; // ����ȸ���� 1 ����
		if(accumulatedRotation < maxRotation) //���� ȸ��
		{
			System.out.println(location + " HankookTire ���� : " + (maxRotation - accumulatedRotation) + "ȸ");
			return true;
		}
		else //��ũ
		{
			System.out.println("***"+location+" HankookTire ��ũ ***");
			return false;
		}
	}
}
