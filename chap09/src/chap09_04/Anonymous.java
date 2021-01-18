package chap09_04;
/*
 * �͸� �ڽ� ��ü ����
 */
public class Anonymous {
	//�ʵ� �ʱⰪ���� ����
	Person field = new Person() //�ʵ� ����� �ʱⰪ ����
	{
		void work(){
			System.out.println("����մϴ�.");
		}

		@Override
		void wake(){
			System.out.println("6�ÿ� �Ͼ�ϴ�.");
			work();
		}
	};

	void method1()
	{
		//���� ���������� ����
		Person localVar = new Person() //���� ���� ����� �ʱⰪ ����
		{
			void walk(){
				System.out.println("��å�մϴ�.");
			}

			@Override
			void wake(){
				System.out.println("7�ÿ� �Ͼ�ϴ�.");
				walk();
			}
		};
		//���� ���� ���
		localVar.wake();
	}
	
	void method2(Person person)
	{
		person.wake();
	}
}
