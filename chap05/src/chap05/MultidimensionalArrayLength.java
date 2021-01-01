package chap05;
/*
 * 다차원 배열 길이
 */
public class MultidimensionalArrayLength {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] scores = new int[2][3];
		System.out.println(scores.length);
		System.out.println(scores[0].length);
		System.out.println(scores[1].length);
		System.out.println();
		
		//다른 방식도 있다.
		//계단 식으로 이루어진 경우
		int[][] score = new int[2][];
		score[0]=new int[2];
		score[1]=new int[3];
		System.out.println(scores.length);
		System.out.println(scores[0].length);
		System.out.println(scores[1].length);
		System.out.println();
	}

}
