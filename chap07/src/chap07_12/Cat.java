package chap07_12;
/*
 * �߻� �޼ҵ� �������̵�
 */
public class Cat extends Animal{
	public Cat()
	{
		this.kind = "������";
	}
	
	//�߻� �޼ҵ� ������
	@Override
	public void sound()
	{
		System.out.println("�߿�");
	}

}
