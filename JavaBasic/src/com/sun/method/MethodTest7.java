package com.sun.method;
/**
 * �ѱ�������ĳɷ�������
 * @author ��
 * @date 2017��9��16��
 */
public class MethodTest7 {
	public static void main(String[] args) {
		//����һ������
		int[] array = {12,345,5,7,43};
		//���ñ�������
		printArray(array);
 	}
	
	/**
	 * ��������
	 */
	public static void printArray(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
	}
}
