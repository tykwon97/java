package chap05;
/*
 * ������ �迭 ����
 */
public class MultidimensionalArrayLength {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] scores = new int[2][3];
		System.out.println(scores.length);
		System.out.println(scores[0].length);
		System.out.println(scores[1].length);
		System.out.println();
		
		//�ٸ� ��ĵ� �ִ�.
		//��� ������ �̷���� ���
		int[][] score = new int[2][];
		score[0]=new int[2];
		score[1]=new int[3];
		System.out.println(scores.length);
		System.out.println(scores[0].length);
		System.out.println(scores[1].length);
		System.out.println();
	}

}
