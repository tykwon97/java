package chap06_10.package1;
/*
 * 생성자의 접근 제한
 */
public class B {

	//필드
	A a1 = new A(true);
	A a2 = new A(1);
	//A a3 = new A("문자열"); -> private생성자 접근 불가(컴파일 에러)
	
}
