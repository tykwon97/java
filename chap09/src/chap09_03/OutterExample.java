package chap09_03;
/*
 * ���� Ŭ����
 */
public class OutterExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Outter outter = new Outter();
		Outter.Nested nested = outter.new Nested();
		nested.print();
	}

}
