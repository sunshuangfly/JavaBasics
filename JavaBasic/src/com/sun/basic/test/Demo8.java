package com.sun.basic.test;

import java.util.Scanner;

/**
 * ����:
 * 	����¼������,Ҫ����������λ����,������Ҫ�����ݽ��м���,���ܹ�������:
 * 	ÿλ���ֶ�����5,Ȼ�����10����������������
 * 	�ٽ���һλ�͵���λ����,�ڶ�λ�͵���λ����
 * 	���Ѽ��ܺ�����ݴ�ӡ������̨
 * 
 *����: �����ݴ��������бȽϺò���
 *	1,����¼��һ��4λ��
 *	2,����һ������Ϊ4������
 *	3,
 * @author ��
 * @date 2017��9��22��
 */
public class Demo8 {
	public static void main(String[] args) {
		//����¼��һ��4λ��
		Scanner sc = new Scanner(System.in);
		//��������
		int number = sc.nextInt();
		//����һ������Ϊ4������
		int[] arr = new int[4];
		//��number���4λ��ÿһλ����˳��ֱ�ֵ��������
		arr[0] = number/1000%10;
		arr[1] = number/100%10;
		arr[2] = number/10%10;
		arr[3] = number%10;
		//��������
		for (int i = 0; i < arr.length; i++) {
			//ÿλ���ֶ�����5
			arr[i] += 5;
			//����10����������������
			arr[i]%=10;
		}
		//�ٽ���һλ�͵���λ����,�ڶ�λ�͵���λ����
		int temp = arr[0];
		arr[0] = arr[3];
		arr[3] = temp;
		int temp2 = arr[1];
		arr[1] = arr[2];
		arr[2] = temp2;
		//�������ܺ������
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]);
		}
	}
}
