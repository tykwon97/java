package chap06_10.package2;
/*
 * 필드와 메소드의 접근 제한
 */
import chap06_10.package1.A_1;

public class C_1 {
	public C_1()
	{
		A_1 a = new A_1();
		a.field1 = 1;
		//a.field2 = 1; // default 필드 접근 불가(컴파일 에러)
		//a.field3 = 1; //private 필드 접근 불가 (컴파일 에러)
		
		
		a.method1();
		//a.method2(); // default 메소드 접근 불가(컴파일 에러)
		//a.method3(); //private 메소드 접근 불가 (컴파일 에러)
	}
}
