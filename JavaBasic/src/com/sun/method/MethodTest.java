package com.sun.method;

import java.util.Scanner;

/*
 * ����¼����������,�����������е����ֵ
 */
public class MethodTest {
	public static void main(String[] args) {
		//��������¼�����
		Scanner sc = new Scanner(System.in);
		//��������
		System.out.println("�������һ������:");
		int a = sc.nextInt();
		
		System.out.println("������ڶ�������:");
		int b = sc.nextInt();
		
		//���÷���
		int max = getMax(a, b);
		System.out.println("���ֵ��:"+max);
	}
	
	/**
	 * �����������е����ֵ
	 * 
	 * ������ȷ:
	 * 	����ֵ����:int
	 * 	�����б�: int a,int b
	 */
	public static int getMax(int a,int b) {
		if(a > b) {
			return a;
		}else {
			return b;
		}
	}
}
