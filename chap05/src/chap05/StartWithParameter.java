package chap05;
/*(
 * ���� �޼ҵ��� �Ű�����
 * 
 * Main �޼ҵ忡 �Ű����� �����ϴ� ��
 * 		Run -> Run Configurations -> Main -> Arguments -> Program arguments (10 20)�Է�
 */
public class StartWithParameter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			if(args.length !=2) //�Էµ� ������ ������ 2���� �ƴ� ���
			{
				System.out.println("�����׷��� ����");
				System.out.println("Java MainStringArrayArgument num1 num2");
				System.exit(0); // ���α׷� ���� ����
			}
			
			String strNum1 = args[0]; //ù��° ������ ���
			String strNum2 = args[1]; //�ι�° ������ ���
			
			//���ڿ��� ������ ��ȯ
			int num1 = Integer.parseInt(strNum1);
			int num2 = Integer.parseInt(strNum2);
			
			int result = num1 + num2;
			System.out.println(num1 + " + " + num2 + " = " + result);
	}

}
