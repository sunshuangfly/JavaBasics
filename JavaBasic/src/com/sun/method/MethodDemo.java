package com.sun.method;
/**
 * ����:��ʵ��������ض����ܵĴ����
 * 
 * �����ʽ:
 * 		���η� ����ֵ���� ������(�������� ������1,�������� ������2...) {
 * 			������;
 * 			return ����ֵ;
 * 		}
 * 
 * дһ��������������ȷ:
 * 		1,����ֵ����	��ȷ���ܽ������������
 * 		2,�����б�		��ȷ�м�������,�Լ���������������
 * @author ��
 * @date 2017��9��16��
 */
//дһ�������������
public class MethodDemo {
	public static void main(String[] args) {
		//ֱ�ӵ���,û������
		sum(10,20);
		
		//�������,������.����ֻ�����,���ܶԽ��������������
		System.out.println(sum(10,20));
		
		//��ֵ���� ���ԶԽ��������������
		int result = sum(10,20);
		System.out.println(result);
		int result2 = result +20;
		System.out.println(result2);
	}
	
	/**
	 * ������ȷ:
	 * 		����ֵ����:int 
	 * 		�����б�:int a ,int b
	 */
	public static int sum(int a,int b) {
		int c = a + b;
		return c;
	}
}
