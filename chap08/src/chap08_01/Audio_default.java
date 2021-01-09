package chap08_01;
/*
 *  ���� Ŭ����
 *  RemoteControl�� default�޼ҵ� ����ϱ�
 */
public class Audio_default implements RemoteControl {
	//�ʵ�
		private int volume;
		private boolean mute; //�̹� Ŭ������ �߰� ��
		
		//turnOn() �߻�޼ҵ��� ��ü �޼ҵ�
			public void turnOn()
			{
				System.out.println("Audio�� �մϴ�.");
			}
			//turnOff() �߻� �޼ҵ��� ��ü �޼ҵ�
			public void turnOff()
			{
				System.out.println("Audio�� ���ϴ�.");
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
			
			//����Ʈ �޼ҵ� ������
			@Override
			public void setMute(boolean mute)
			{
				this.mute = mute;
				if(mute)
					System.out.println("Audio ���� ó���մϴ�.");
				else
					System.out.println("Audio ���� �����մϴ�.");
				
			}
}
