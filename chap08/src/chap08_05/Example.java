package chap08_05;
/*
 * 
 */
public class Example {

	public static void main(String[] args) {
		ImplementationC impl = new ImplementationC();
		
		InterfaceA ia = impl;
		ia.methodA(); //interfaceA 변수는 methodA()만 호출 가능
		System.out.println(); 
		
		InterfaceB ib = impl;
		ib.methodB(); //interfaceB 변수는 methodB()만 호출 가능
		System.out.println(); 

		InterfaceC ic = impl;
		 //interfaceC 변수는 methodA(),methodB(),methodC() 모두 호출 가능
		ic.methodA();
		ic.methodB();
		ic.methodC();
		System.out.println(); 
	}

}
