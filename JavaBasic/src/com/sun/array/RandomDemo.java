package com.sun.array;

import java.util.Random;
import java.util.Scanner;

import org.junit.Test;
import org.omg.Messaging.SyncScopeHelper;

/**
 * Random:���ڲ��������
 * 
 * ʹ�ò���:
 * 	1,���� :import java.util.Random;
 * 	2,��������
 *  	Random r = new Random();
 *  3,��ȡ�����
 *  	int number = r.nextInt(10);
 *  	��ȡ�������Χ:[0,10) ����0,������10
 * @author ��
 * @date 2017��9��15��
 */
public class RandomDemo {
	public static void main(String[] args) {
		//��������
		Random r = new Random();
		for (int i = 0; i < 10; i++) {
			//��ȡ�����
			int number = r.nextInt(10);
			System.out.println(number);
		}
		System.out.println("-----------");
		//��λ�ȡ1-100֮��������?
		//int i = r.nextInt(100); //[0,100) ����0,������100
		int i = r.nextInt(100)+1; //[1,100] �����1
		System.out.println(i);
	}
	/**
	 * RandomС����
	 * ϵͳ����һ��1-100�������,��³���������Ƕ���.
	 * 
	 * ����: 
	 * 		1,ϵͳ����һ��1-100�������
	 * 		2,����¼������
	 * 		3,�Ƚ�����������
	 * 			����:��ʾ����
	 * 			С��:��ʾС��
	 * 			������:��ϲ����
	 */
	@Test
	public void test1() {
		//ϵͳ����һ��1-100�����
		Random r = new Random();
		//��ȡ�����
		int number = r.nextInt(100)+1;
		//����¼������Ҫ���������
		Scanner s = new Scanner(System.in);
		while(true) {
			//��������
			System.out.println("��������Ҫ�µ�����(1-100):");
			int guessNumber = s.nextInt();
			//�ж��������ݴ�С
			if(guessNumber > number ) {
				System.out.println("��µ����ִ���");
			}else if(guessNumber < number){
				System.out.println("��µ�����С��");
			}else {
				System.out.println("��ϲ�������");
				break;
			}
		}
	}
}
