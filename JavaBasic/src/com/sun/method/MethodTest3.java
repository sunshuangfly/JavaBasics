package com.sun.method;

import java.util.Scanner;

/**
 * ����¼���������� �������ֵ
 * @author ��
 * @date 2017��9��16��
 */
public class MethodTest3 {

	public static void main(String[] args) {
		//��������¼�����
		Scanner sc = new Scanner(System.in);
		//��������
		System.out.println("�������һ������:");
		int a = sc.nextInt();
		System.out.println("������ڶ�������:");
		int b = sc.nextInt();
		System.out.println("���������������:");
		int c = sc.nextInt();
		//���÷���
		int result = getMax(a, b, c);
		System.out.println("�����������ֵ��:"+result);
	}
	
	/**
	 * ���������������ֵ
	 * ������ȷ
	 * 	����ֵ����:int
	 * 	�������б�:int a,int b,int c
	 */
	public static int getMax(int a,int b,int c) {
		if(a > b) {
			if(a >c) {
				return a;
			}else {
				return c;
			}
		}else {
			if(b > c) {
				return b;
			}else {
				return c;
			}
		}
	}
}
