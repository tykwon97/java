package chap06_11;
/*
 * Getter�� Setter �޼ҵ� ����
 */
public class Car {
	
	//�ʵ�
	private int speed;
	private boolean stop;
	//boolean�� �⺻������ false�̴�.
	
	//������
	
	//�޼ҵ�
	public int getSpeed()
	{
		return speed;
	}
	
	public void setSpeed(int speed)
	{
		if(speed<0)
		{
			this.speed = 0;
			return;
		}
		else
		{
			this.speed = speed;
		}
	}
	
	public boolean isStop()
	{
		return stop;
	}
	
	public void setStop(boolean stop)
	{
		this.stop = stop;
		this.speed =0;
	}

}