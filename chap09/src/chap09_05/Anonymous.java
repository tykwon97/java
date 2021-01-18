package chap09_05;
/*
 * �͸� ���� Ŭ������ ��ü ����
 */
public class Anonymous {
	//�ʵ� �ʱⰪ���� ����
	RemoteControl field = new RemoteControl() //�ʵ� ����� �ʱⰪ ����
	{
		@Override
		public void turnOn(){
			System.out.println("TV�� �մϴ�.");
		}

		@Override
		public void turnOff(){
			System.out.println("TV�� ���ϴ�.");
		}
	};
	void method1()
	{
		//���� ���������� ����
		RemoteControl localVar = new RemoteControl() //���� ���� ����� �ʱⰪ ����
		{
			@Override
			public void turnOn(){
				System.out.println("Audio�� �մϴ�.");
			}

			@Override
			public void turnOff(){
				System.out.println("Audio�� ���ϴ�.");
			}
		};
		//���� ���� ���
		localVar.turnOn();
	}
	
	void method2(RemoteControl rc)
	{
		rc.turnOn();
	}
}
