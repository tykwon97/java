package chap08_01;
/*
 * 디폴트 메소드 사용 + 정적 메소드 사용
 */
public class RemoteControlExample_default {

	public static void main(String[] args) {
		//인터페이스 변수 선언
		RemoteControl rc = null;

		//Television 객체를 인터페이스 타입에 대입
		rc = new Television();
		//인터페이스의 turnOn(), turnOff()호출
		rc.turnOn();
		rc.setMute(true);

		//Audio 객체를 인터페이스 타입에 대입
		rc = new Audio();
		//인터페이스의 turnOn(), turnOff()호출
		rc.turnOn();
		rc.setMute(true);
		
		//------------------ 정적 메소드 사용 ------------------------------
		//정적 메소드 사용 -> 인터페이스로 바로 호출 가능	
		RemoteControl.changeBattery(); 
	}

}

