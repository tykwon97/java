package chap05;
/*
 * 배열 복사 - System.arraycopy()
 */
public class Array_Copy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//for문으로 배열 복사
		int[] oldIntArray = {1,2,3};
		int[] newIntArray = new int[5];
		
		for(int i=0;i<oldIntArray.length;i++)
		{
			newIntArray[i]=oldIntArray[i];
		}
		
		for(int i=0;i<newIntArray.length;i++)
		{
			System.out.print(newIntArray[i]+", ");
		}
		System.out.println();
		
		//System.arraycopy()메소드 사용 -> 배열 복사
		
		String[] oldStrArray = {"java","array","copy"};
		String[] newStrArray = new String[5];
		
		System.arraycopy(oldStrArray, 0, newStrArray, 0, oldStrArray.length);
		
		for(int i=0;i<newStrArray.length;i++)
		{
			System.out.print(newStrArray[i]+", ");
		}
		  
		System.out.println();
	}

}
