package chap07_12;
/*
 * �߻� �޼ҵ� ����
 */
public abstract class Animal { //�߻� Ŭ����
	public String kind;
	
	public void breathe()
	{
		System.out.println("���� ���ϴ�.");
	}
	
	public abstract void sound(); //�߻� �޼ҵ�

}
