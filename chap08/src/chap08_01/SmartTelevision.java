package chap08_01;
/*
 * ���� �������̽� ���� Ŭ����
 */
public class SmartTelevision implements RemoteControl, Searchable {
	//�ʵ�
		private int volume;

		//turnOn() �߻�޼ҵ��� ��ü �޼ҵ�
		public void turnOn()
		{
			System.out.println("TV�� �մϴ�.");
		}
		//turnOff() �߻� �޼ҵ��� ��ü �޼ҵ�
		public void turnOff()
		{
			System.out.println("TV�� ���ϴ�.");
		}

		//setVolume() �߻� �޼ҵ��� ��ü �޼ҵ�
		//�������̽� ����� �̿��ؼ� volume �ʵ��� ���� ����
		public void setVolume(int volume)
		{
			if(volume > RemoteControl.MAX_VOLUME)
				this.volume = RemoteControl.MAX_VOLUME;
			else if(volume < RemoteControl.MIN_VOLUME)
				this.volume = RemoteControl.MIN_VOLUME;
			else
				this.volume = volume;
			System.out.println("���� TV ���� : " + volume);
		}
		
		//searchable()�� �߻� �޼ҵ忡 ���� ��ü �޼ҵ�
		public void search(String url)
		{
			System.out.println(url + "�� �˻��մϴ�.");
		}
}
