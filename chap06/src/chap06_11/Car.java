package chap06_11;
/*
 * Getter와 Setter 메소드 선언
 */
public class Car {
	
	//필드
	private int speed;
	private boolean stop;
	//boolean은 기본적으로 false이다.
	
	//생성자
	
	//메소드
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
