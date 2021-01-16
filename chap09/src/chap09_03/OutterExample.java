package chap09_03;
/*
 * 실행 클래스
 */
public class OutterExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Outter outter = new Outter();
		Outter.Nested nested = outter.new Nested();
		nested.print();
	}

}
