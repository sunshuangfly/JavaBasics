package com.sun.basic.test;
/**
 * ����һ��int����,��������ض�Ҫ���Ԫ�غ�
 * ��������:{171,72,19,16,118,51,210,7,18};
 * Ҫ��:���Ԫ�ظ�λ��ʮλ���ܰ���7,����ֻ��Ϊż��
 * @author ��
 * @date 2017��9��18��
 */
public class Demo4 {
	public static void main(String[] args) {
		//��������
		int[] arr = {171,72,19,16,118,51,210,7,18};
		//������ͱ���sum
		int sum = 0;
		//ѭ����������
		for (int i = 0; i < arr.length; i++) {
			//�ж�����
			if(arr[i]%10 != 7 && arr[i]/10%10 != 7 && arr[i]%2 == 0) {
				sum+=arr[i];
				System.out.println(arr[i]);
			}
		}
		System.out.println(sum);
	}
}
