package com.sun.basic.test;

import java.util.Scanner;

/**
 * ����:����Ԫ�ز���(�����ƶ�Ԫ�ص�һ���������г��ֵ�����)
 * 1,��������int[] arr= {5,7,3,2,5};
 * 2,Ҫ���ѯԪ��ͨ������¼�뷽ʽȷ��
 * 3,����һ����������Ԫ�ص�һ�γ���λ�õķ���(ע,Ҫ���ҵ�Ԫ�ؾ��Ǽ���¼�������)
 * @author ��
 * @date 2017��9��22��
 */
public class Demo7 {
	public static void main(String[] args) {
		//��������
		int[] arr= {5,7,3,2,5};
		//��������¼�����
		Scanner sc = new Scanner(System.in);
		//��������
		System.out.println("�����뱻��ѯ������:");
		int number = sc.nextInt();
		//���÷���,��ѯ����
		int index = firstIndex(arr, number);
		if(index == -1) {
			System.out.println("��Ҫ��ѯ�������ڸ������в�����!");
		}else {
			System.out.println("��Ҫ��ѯ��Ԫ���ڸ������е�����λ��Ϊ:"+index);
		}
	}
	
	//д�������ز�ѯָ��Ԫ���������е�һ�γ��ֵ�����λ��
	public static int firstIndex(int[] arr,int number) {
		for (int i = 0; i < arr.length; i++) {
			if(number == arr[i]) {
				return i;
			}
		} 
		return -1;
	}
}

