package chap07_07;
/*
 * Tire의 자식 클래스
 */
public class HankookTire extends Tire {
	//필드
	//생성자
	
	public HankookTire(String location, int maxRotation)
	{
		super(location,maxRotation);
	}
	
	//메소드
	//출력 내용을 달리하기 위해 재정의(오버라이딩)한 roll()메소드
	@Override
	public boolean roll()
	{
		++accumulatedRotation; // 누적회전수 1 증가
		if(accumulatedRotation < maxRotation) //정상 회전
		{
			System.out.println(location + " HankookTire 수명 : " + (maxRotation - accumulatedRotation) + "회");
			return true;
		}
		else //펑크
		{
			System.out.println("***"+location+" HankookTire 펑크 ***");
			return false;
		}
	}
}
