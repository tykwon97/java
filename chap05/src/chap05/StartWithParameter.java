package chap05;
/*(
 * 메인 메소드의 매개변수
 * 
 * Main 메소드에 매개변수 전달하는 법
 * 		Run -> Run Configurations -> Main -> Arguments -> Program arguments (10 20)입력
 */
public class StartWithParameter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			if(args.length !=2) //입력된 데이터 개수가 2개가 아닐 경우
			{
				System.out.println("포르그램의 사용법");
				System.out.println("Java MainStringArrayArgument num1 num2");
				System.exit(0); // 프로그램 강제 종료
			}
			
			String strNum1 = args[0]; //첫번째 데이터 얻기
			String strNum2 = args[1]; //두번째 데이터 얻기
			
			//문자열을 정수로 변환
			int num1 = Integer.parseInt(strNum1);
			int num2 = Integer.parseInt(strNum2);
			
			int result = num1 + num2;
			System.out.println(num1 + " + " + num2 + " = " + result);
	}

}
