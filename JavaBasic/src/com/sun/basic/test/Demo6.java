package com.sun.basic.test;

import java.util.Scanner;

/**
 * ����:
 * 1,����¼��5��int���͵����ݴ�������arr��
 * 2,���巽����arr�����е����ݷ�ת
 * 3,���巽���Է�ת���������б���
 * 
 * ����:
 * 1,����һ������Ϊ5������
 * 2,����¼�����ݸ�������Ԫ�ظ�ֵ
 * 3,���巽����arr�����е����ݷ�ת
 * 4,���巽�����������
 * 
 * ���ʵ�ַ�ת
 * ����0����Ԫ�����������Ԫ�ؽ���
 * ����1����Ԫ����δ�����Ԫ�ؽ���
 * ...
 * ���Զ���0����Ϊ int start = 0;
 * �������Ϊ int end = arr.length-1;
 * ��Ҫ����,start <= end ,�������м�λ�þͲ����ٽ�����
 * @author ��
 * @date 2017��9��22��
 */
public class Demo6 {
	public static void main(String[] args) {
		//����һ������Ϊ5������
		int[] arr = new int[5];
		//��������¼�����
		Scanner sc = new Scanner(System.in);
		//ѭ����������,����ֵ��������
		for (int i = 0; i < arr.length; i++) {
			System.out.println("�������"+(i+1)+"������:");
			//��������
			int number = sc.nextInt();
			//������Ԫ�ظ�ֵ
			arr[i] = number;
		}
		reverse(arr);
		//printArray(arr);
		printArr(arr);
	}
	
	//д����ʵ�ַ�ת
	public static void reverse(int[] arr) {
		for(int start=0,end=arr.length-1;start<=end;start++,end--)  {
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
		}
	}
	
	//д������������
	public static void printArray(int[] arr) {
		for (int i : arr) {
			System.out.println(i);
		}
	}
	//for��������
	public static void printArr(int[] arr) {
		System.out.print("��ת�������Ϊ:[");
		for (int i = 0; i < arr.length; i++) {
			if(i == arr.length-1) {
				System.out.print(arr[i]+"]");
			}else {
				System.out.print(arr[i]+",");
			}
		}
	}
}
