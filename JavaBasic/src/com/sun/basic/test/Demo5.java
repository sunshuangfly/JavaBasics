package com.sun.basic.test;

import java.util.Scanner;

/**
 * ����:�ڱ�̾�����,��������ί��ѡ�ִ��,����Ϊ0-100.
 * ѡ�ֵ����÷�Ϊ:ȥ��һ����߷ֺ�һ����ͷֺ��4����ίƽ����
 * ����ʵ��(������С������)
 * ��ί�����ü���¼��ʵ��
 * @author ��
 * @date 2017��9��22��
 */
public class Demo5 {
	public static void main(String[] args) {
		//����һ������,�����ַ���������
		int[] arr = new int[6];
		//��������¼�����
		Scanner sc = new Scanner(System.in);
		/*//������ί����
		System.out.println("�������1����ί�ķ���:");
		int num1 = sc.nextInt();
		System.out.println("�������2����ί�ķ���:");
		int num2 = sc.nextInt();
		System.out.println("�������3����ί�ķ���:");
		int num3 = sc.nextInt();
		System.out.println("�������4����ί�ķ���:");
		int num4 = sc.nextInt();
		System.out.println("�������5����ί�ķ���:");
		int num5 = sc.nextInt();
		System.out.println("�������6����ί�ķ���:");
		int num6 = sc.nextInt();*/
		//����ͨ��ѭ��ʵ��,�������������������
		for (int i = 0; i < arr.length; i++) {
			System.out.println("�������"+(i+1)+"����ί�ķ���:");
			//������ί����
			int score = sc.nextInt();
			//����������������
			arr[i] = score;
		}
		//�������ֵ�������������
		int man = maxNum(arr);
		//������Сֵ��������С����
		int min = minNum(arr);
		//����ܷ�
		int sum = sum(arr);
		//������ƽ����
		int avg = (sum-man-min)/(arr.length-2);
		System.out.println("ѡ�ֵ����÷�Ϊ:"+avg+"��");
	}
	
	//������ȡ�������ֵ
	public static int maxNum(int[] arr) {
		//����arr[0]Ϊ���ֵmax
		int max = arr[0]; 
		for (int i = 0; i < arr.length; i++) {
			if(max < arr[i]) {
				max = arr[i];
			}
		}
		System.out.println(arr[0]);
		return max;
	}
	
	//������ȡ������Сֵ
	public static int minNum(int[] arr) {
		//����arr[0]λ��Сֵmin
		int min = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if(min > arr[i]) {
				min = arr[i];
			}
		}
		return min;
	}
	
	//������ȡ����Ԫ�غ�
	public static int sum(int[] arr) {
		//������ͱ���sum
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum+=arr[i];
		}
		return sum;
	}
}
