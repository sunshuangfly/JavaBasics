package com.sun.basic.test;

import java.util.Scanner;

/**
 * ����¼��һ���·�,�����Ӧ����
 * @author ��
 * @date 2017��9��16��
 */
public class Demo1 {
	public static void main(String[] args) {
		//��������¼�����
		Scanner sc = new Scanner(System.in);
		
		//������ʾ,����¼��
		System.out.println("������һ���·�:");
		int month = sc.nextInt();
		//���ò�ѯ���ڷ���,���ض�Ӧ����
		//printSeason(month);
		//print(month);
		printSeason2(month);
	}
	
	/**
	 * �����·�,��ӡ��Ӧ����
	 * ������ȷ:
	 * 	����ֵ:void
	 * 	�����б�:int month
	 */
	public static void printSeason(int month) {
		while(true) {
			if(month == 1||month == 2||month == 3) {
				System.out.println("����");
				break;
			}else if(month == 4||month == 5||month == 6) {
				System.out.println("�ļ�");
			}else if(month == 7||month == 8||month == 9) {
				System.out.println("�＾");
			}else if(month == 10||month == 11||month == 12) {
				System.out.println("����");
			}else if(0 >= month || month > 12) {
				System.out.println("������������,����������");
			}else if(month == -1) {
				break;
			}
		}
	}
	public static void print(int month) {
		switch (month) {
		case 1:
			System.out.println("����");
			break;
		case 2:
			System.out.println("����");
			break;
		case 3:
			System.out.println("����");
			break;
		case 4:
			System.out.println("�ļ�");
			break;
		case 5:
			System.out.println("�ļ�");
			break;
		case 6:
			System.out.println("�ļ�");
			break;
		case 7:
			System.out.println("�＾");
			break;
		case 8:
			System.out.println("�＾");
			break;
		case 9:
			System.out.println("�＾");
			break;
		case 10:
			System.out.println("����");
			break;
		case 11:
			System.out.println("����");
			break;
		case 12:
			System.out.println("����");
			break;

		default:
			System.out.println("������������");
			break;
		}
	}
	
	/**
	 * ͨ��case��͸ԭ��,���Լ򻯴���
	 */
	public static void printSeason2(int month) {
		switch (month) {
		case 12:
		case 1:
		case 2:
			System.out.println("����");
			break;
		case 3:
		case 4:
		case 5:
			System.out.println("����");
			break;
		case 6:
		case 7:
		case 8:
			System.out.println("����");
			break;
		case 9:
		case 10:
		case 11:
			System.out.println("����");
			break;

		default:
			System.out.println("���������������������");
			break;
		}
	}
}
