package chap07_03;
/*
 * �ڽ� Ŭ����
 */
public class Computer extends Calculator {
	@Override //������̼�
	double areaCircle(double r)
	{
		System.out.println("Computer ��ü�� areaCircle() ����");
		return Math.PI * r * r;
		//Math.PI �� �ڹ� ǥ�� API�� ��Ȯ�� ��� ����
	}

}
