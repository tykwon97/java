package chap08_05;
/*
 * 
 */
public class Example {

	public static void main(String[] args) {
		ImplementationC impl = new ImplementationC();
		
		InterfaceA ia = impl;
		ia.methodA(); //interfaceA ������ methodA()�� ȣ�� ����
		System.out.println(); 
		
		InterfaceB ib = impl;
		ib.methodB(); //interfaceB ������ methodB()�� ȣ�� ����
		System.out.println(); 

		InterfaceC ic = impl;
		 //interfaceC ������ methodA(),methodB(),methodC() ��� ȣ�� ����
		ic.methodA();
		ic.methodB();
		ic.methodC();
		System.out.println(); 
	}

}
