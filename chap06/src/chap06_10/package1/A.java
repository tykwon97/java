package chap06_10.package1;
/*
 * 생성자의 접근 제한
 */
public class A {

	//필드
	A a1 = new A(true); //public 접근 제한
	A a2 = new A(1); // default 접근 제한
	A a3 = new A("문자열"); // private 접근 제한
	
	//생성자
	public A(boolean b) {}
	A(int b) {}
	private A(String S) {}
}
