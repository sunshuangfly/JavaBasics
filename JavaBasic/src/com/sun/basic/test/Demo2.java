package com.sun.basic.test;
/**
 * ��ӡ5λ���е����л�����
 * 	ʲô�ǻ�����:12321�ǻ�����,��λ������λ����ͬ,ʮλ���λ��ͬ
 * @author ��
 * @date 2017��9��18��
 */
public class Demo2 {
	public static void main(String[] args) {
		//���÷�����ӡ������
		print();
	}
	
	//
	public static void print() {
		//��������5λ��
		for (int i = 10000; i < 100000; i++) {
			//����ge,shi,bai,qian,wan�������λ
			int ge = i%10;
			int shi = i/10%10;
			int bai = i/100%10;
			int qian = i/1000%10;
			int wan = i/10000%10;
			if(ge == wan && shi == qian) {
				System.out.println(i);
			}
		}
	}
}
