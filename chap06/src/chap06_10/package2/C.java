package chap06_10.package2;

import chap06_10.package1.A;

public class C {
	public C()
	{
		//필드
		A a1 = new A(true); 
		//A a2 = new A(1); // default 생성자 접근 불가(컴파일 에러)
		//A a3 = new A("문자열"); // private 생성자 접근 불가(컴파일 에러)
	}
}
