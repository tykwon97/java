package chap07_07;
/*
 * Tire�� �ڽ� Ŭ����
 */
public class KumhoTire extends Tire{

	//�ʵ�
	//������
	public KumhoTire(String location, int maxRotation)
	{
		super(location, maxRotation);
	}
	
	//�޼ҵ�
	//��� ������ �޸��ϱ� ���� ������(�������̵�)�� roll()�޼ҵ�
	@Override
	public boolean roll()
	{
		++accumulatedRotation; // ����ȸ���� 1 ����
		if(accumulatedRotation < maxRotation) //���� ȸ��
		{
			System.out.println(location + " KumhoTire ���� : " + (maxRotation - accumulatedRotation) + "ȸ");
			return true;
		}
		else //��ũ
		{
			System.out.println("***"+location+" KumhoTire ��ũ ***");
			return false;
		}
	}
}
