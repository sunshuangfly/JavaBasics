package com.sun.method;

import java.util.Scanner;

/**
 * ����¼��������,�Ƚ��������Ƿ����
 * @author ��
 * @date 2017��9��16��
 */
public class MethodTest2 {

	public static void main(String[] args) {
		//��������¼�����
		Scanner sc = new Scanner(System.in);
		
		//��������
		System.out.println("�������һ������:");
		int a = sc.nextInt();
	
		System.out.println("������ڶ�������:");
		int b = sc.nextInt();
		
		boolean flag = compare(a, b);
		System.out.println("�������������? "+flag);
		
	}
	
	/**
	 * �Ƚ��������Ƿ����
	 * ������ȷ :
	 * 	����ֵ����:boolean
	 * 	�����б�: int a,int b
	 */
	public static boolean compare(int a,int b) {
		if(a == b) {
			return true;
		}else {
			return false;
		}
	}
}
