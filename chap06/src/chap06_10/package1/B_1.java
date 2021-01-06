package chap06_10.package1;
/*
 * 필드와 메소드의 접근 제한
 */
public class B_1 {
	
	public B_1()
	{
		A_1 a = new A_1();
		a.field1 = 1;
		a.field2 = 1;
		//a.field3 = 1; //private 필드 접근 불가 (컴파일 에러)
		
		
		a.method1();
		a.method2();
		//a.method3(); //private 메소드 접근 불가 (컴파일 에러)
	}
}
