package chap06_06;

//�޼ҵ� �����ε�

public class CalculatorExample {

	public static void main(String[] args) {
		Calculator myCalcu = new Calculator();
		
		//���簢���� ���� ���ϱ�
		double result1 = myCalcu.areaRectangel(10);
		
		//���簢���� ���� ���ϱ�
		double result2 = myCalcu.areaRectangel(10,20);
		
		//��� ���
		System.out.println("���簢���� ���� : "+result1);
		System.out.println("���簢���� ���� : "+result2);
	}

}
