package com.sun.array;
/**
 * �����ȡ��ֵ
 * @author ��
 * @date 2017��9��15��
 */
public class ArrayDemo {

	public static void main(String[] args) {
		//��������
		int[] arr = {2,100,6,8,23,5,6,42,86,324,654,7,64,64,2,654,4,532,999,1};
		//�����������
		ArrayDemo arrayDemo = new ArrayDemo();
		//���ñ��෽��,��ȡ���ֵ
		arrayDemo.maxNum(arr);
		//���ñ��෽��,��ȡ��Сֵ
		arrayDemo.minNum(arr);
	}

	private void maxNum(int[] arr) {
		// ����maxΪ���ֵ
		int max = arr[0];
		for (int i = 0; i < arr.length; i++) {
			//���ѭ�����б�max���ֵ,��ֵ��max
			if(arr[i] > max) {
				max = arr[i];
			}
		}
		System.out.println("���ֵ��:"+max);
	}
	
	private void minNum(int[] arr) {
		//�����һ����Ϊ��Сֵ
		int min = arr[0];
		for (int i = 0; i < arr.length; i++) {
			//�жϱȽ�,���б�minС��,��ֵ��min
			if(arr[i] < min) {
				min = arr[i];
			}
		}
		System.out.println("��Сֵ��:"+min);
	}
}
