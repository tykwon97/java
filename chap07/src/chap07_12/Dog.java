package chap07_12;
/*
 * �߻� �޼ҵ� �������̵�
 */
public class Dog extends Animal{
	public Dog()
	{
		this.kind = "������";
	}
	
	//�߻� �޼ҵ� ������
	@Override
	public void sound()
	{
		System.out.println("�۸�");
	}
}
