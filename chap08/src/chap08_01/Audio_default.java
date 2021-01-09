package chap08_01;
/*
 *  구현 클래스
 *  RemoteControl의 default메소드 사용하기
 */
public class Audio_default implements RemoteControl {
	//필드
		private int volume;
		private boolean mute; //이번 클래스에 추가 됨
		
		//turnOn() 추상메소드의 실체 메소드
			public void turnOn()
			{
				System.out.println("Audio를 켭니다.");
			}
			//turnOff() 추상 메소드의 실체 메소드
			public void turnOff()
			{
				System.out.println("Audio를 끕니다.");
			}

			//setVolume() 추상 메소드의 실체 메소드
			//인터페이스 상수를 이용해서 volume 필드의 값을 제한
			public void setVolume(int volume)
			{
				if(volume > RemoteControl.MAX_VOLUME)
					this.volume = RemoteControl.MAX_VOLUME;
				else if(volume < RemoteControl.MIN_VOLUME)
					this.volume = RemoteControl.MIN_VOLUME;
				else
					this.volume = volume;
				System.out.println("현재 TV 볼륨 : " + volume);
			}
			
			//디폴트 메소드 재정의
			@Override
			public void setMute(boolean mute)
			{
				this.mute = mute;
				if(mute)
					System.out.println("Audio 무음 처리합니다.");
				else
					System.out.println("Audio 무음 해제합니다.");
				
			}
}
