package chap09_06;
/*
 * UI Ŭ����
 */
public class Button { //�������̽� Ÿ�� �ʵ�

	OnClickListener listener;
	
	void setOnClickListener(OnClickListener listener) //�Ű� ������ ������
	{
		this.listener=listener;
	}
	
	void touch() // ���� ��ü�� onClick()�޼ҵ� ȣ��
	{
		listener.onClick();
	}
	
	interface OnClickListener //��ø �������̽�
	{
		void onClick();
	}
}
